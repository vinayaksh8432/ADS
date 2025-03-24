class Leetcode1752 {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }

    public static void main(String[] args) {
        Leetcode1752 solution = new Leetcode1752();
        int[] nums = { 3, 4, 5, 1, 2 };
        System.out.println(solution.check(nums));
    }
}