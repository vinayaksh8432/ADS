class Leetcode169 {
    public int majorityElement(int[] nums) {
        int count = 1;
        int candidate = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
            }
            count += (nums[i] == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        Leetcode169 solution = new Leetcode169();
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(solution.majorityElement(nums));
    }
}