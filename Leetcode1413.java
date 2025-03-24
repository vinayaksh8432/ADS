class Leetcode1413 {
    public int minStartValue(int[] nums) {
        int minSum = 0;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            minSum = Math.min(minSum, currentSum);
        }

        return 1 - minSum;
    }

    public static void main(String[] args) {
        Leetcode1413 solution = new Leetcode1413();
        int[] nums = { -3, 2, -3, 4, 2 };
        System.out.println(solution.minStartValue(nums));
    }
}