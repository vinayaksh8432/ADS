import java.util.*;

class Leetcode78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for (int num : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(num);
                result.add(subset);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Leetcode78 solution = new Leetcode78();
        int[] nums1 = { 1, 2, 3 };
        System.out.println("Test case 1:");
        List<List<Integer>> result1 = solution.subsets(nums1);
        for (List<Integer> subset : result1) {
            System.out.println(subset);
        }
    }
}