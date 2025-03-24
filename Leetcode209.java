class Leetcode209 {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        Leetcode209 solution = new Leetcode209();
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        System.out.println(solution.minSubArrayLen(7, nums));
    }
}