class Leetcode2256 {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;
        long minDiff = Long.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < n; i++) {
            leftSum += nums[i];
            long rightSum = totalSum - leftSum;

            long leftAvg = leftSum / (i + 1);
            long rightAvg = i == n - 1 ? 0 : rightSum / (n - i - 1);

            long diff = Math.abs(leftAvg - rightAvg);
            if (diff < minDiff) {
                minDiff = diff;
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Leetcode2256 solution = new Leetcode2256();
        int[] nums = { 2, 5, 3, 9, 5, 3 };
        System.out.println(solution.minimumAverageDifference(nums));
    }
}