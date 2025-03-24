class Leetcode3151 {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] % 2) == (nums[i - 1] % 2)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Leetcode3151 solution = new Leetcode3151();
        int[] nums = { 2, 1, 4, 3 };
        System.out.println(solution.isArraySpecial(nums));
    }
}