import java.util.*;

class Leetcode523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int mod = k == 0 ? sum : sum % k;

            if (map.containsKey(mod)) {
                if (i - map.get(mod) > 1) {
                    return true;
                }
            } else {
                map.put(mod, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Leetcode523 solution = new Leetcode523();
        int[] nums = { 23, 2, 4, 6, 7 };
        int k = 6;
        System.out.println(solution.checkSubarraySum(nums, k));
    }
}