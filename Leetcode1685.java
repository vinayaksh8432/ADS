import java.util.Arrays;

class Leetcode1685 {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            int leftCount = i;
            int rightCount = n - 1 - i;

            result[i] = (nums[i] * leftCount - leftSum) + (rightSum - nums[i] * rightCount);
            leftSum += nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Leetcode1685 solution = new Leetcode1685();
        int[] nums = { 2, 3, 5 };
        System.out.println(Arrays.toString(solution.getSumAbsoluteDifferences(nums)));
    }
}