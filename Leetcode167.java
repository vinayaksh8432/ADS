import java.util.Arrays;

class Leetcode167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        Leetcode167 solution = new Leetcode167();
        int[] numbers = { 2, 7, 11, 15 };
        System.out.println(Arrays.toString(solution.twoSum(numbers, 9)));
    }
}