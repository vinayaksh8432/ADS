class Leetcode303 {
    private int[] prefixSum;

    public Leetcode303(int[] nums) {
        prefixSum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }

    public static void main(String[] args) {
        Leetcode303 solution = new Leetcode303(new int[] { -2, 0, 3, -5, 2, -1 });
        System.out.println(solution.sumRange(0, 2));
    }
}