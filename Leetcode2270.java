class Leetcode2270 {
    public int waysToSplitArray(int[] nums) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            if (leftSum >= totalSum - leftSum) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Leetcode2270 solution = new Leetcode2270();
        int[] nums = { 10, 4, -8, 7 };
        System.out.println(solution.waysToSplitArray(nums));
    }
}