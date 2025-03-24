class Leetcode1800 {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentSum += nums[i];
                maxSum = Math.max(maxSum, currentSum);
            } else {
                currentSum = nums[i];
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Leetcode1800 solution = new Leetcode1800();
        int[] nums = { 10, 20, 30, 5, 10, 50 };
        System.out.println(solution.maxAscendingSum(nums));
    }
}