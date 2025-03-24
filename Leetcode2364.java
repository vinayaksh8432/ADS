import java.util.*;

class Leetcode2364 {
    public long countBadPairs(int[] nums) {
        long total = (long) nums.length * (nums.length - 1) / 2;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = nums[i] - i;
            map.put(diff, map.getOrDefault(diff, 0) + 1);
        }

        long good = 0;
        for (int count : map.values()) {
            good += (long) count * (count - 1) / 2;
        }

        return total - good;
    }

    public static void main(String[] args) {
        Leetcode2364 solution = new Leetcode2364();
        System.out.println("Test case 1:");
        System.out.println(solution.countBadPairs(new int[] { 4, 1, 3, 3 })); // Expected: 5
    }
}