import java.util.HashMap;

class Leetcode219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        Leetcode219 solution = new Leetcode219();
        int[] nums = { 1, 2, 3, 1 };
        int k = 3;
        System.out.println(solution.containsNearbyDuplicate(nums, k));
    }
}