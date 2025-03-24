class Leetcode3105 {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLen = 1;
        int incLen = 1;
        int decLen = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                incLen++;
                decLen = 1;
            } else if (nums[i] < nums[i - 1]) {
                decLen++;
                incLen = 1;
            } else {
                incLen = 1;
                decLen = 1;
            }
            maxLen = Math.max(maxLen, Math.max(incLen, decLen));
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Leetcode3105 solution = new Leetcode3105();
        int[] nums = { 1, 4, 3, 3, 2 };
        System.out.println(solution.longestMonotonicSubarray(nums));
    }
}