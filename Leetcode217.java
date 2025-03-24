import java.util.*;

class Leetcode217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        Leetcode217 solution = new Leetcode217();
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(solution.containsDuplicate(nums));
    }
}