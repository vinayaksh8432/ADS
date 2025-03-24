import java.util.*;

class Leetcode560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;
            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Leetcode560 solution = new Leetcode560();
        int[] nums = { 1, 1, 1 };
        int k = 2;
        System.out.println(solution.subarraySum(nums, k));
    }
}