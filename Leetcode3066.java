class Leetcode3066 {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        for (int num : nums) {
            if (num < k) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Leetcode3066 solution = new Leetcode3066();
        int[] nums = { 2, 11, 10, 1, 3 };
        System.out.println(solution.minOperations(nums, 10));

        int[] nums2 = { 1, 1, 2, 4, 9 };
        System.out.println(solution.minOperations(nums2, 1));
    }
}