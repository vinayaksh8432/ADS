import java.util.*;

class Leetcode2342 {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int digitSum = getDigitSum(num);
            if (map.containsKey(digitSum)) {
                maxSum = Math.max(maxSum, num + map.get(digitSum));
                map.put(digitSum, Math.max(num, map.get(digitSum)));
            } else {
                map.put(digitSum, num);
            }
        }

        return maxSum;
    }

    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Leetcode2342 solution = new Leetcode2342();
        int[] nums = { 18, 43, 36, 13, 7 };
        System.out.println(solution.maximumSum(nums));

        int[] nums2 = { 10, 12, 19, 14 };
        System.out.println(solution.maximumSum(nums2));
    }
}