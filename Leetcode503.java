import java.util.*;

class Leetcode503 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                result[stack.pop()] = num;
            }
            if (i < n) {
                stack.push(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Leetcode503 solution = new Leetcode503();
        int[] nums = { 1, 2, 1 };
        System.out.println(Arrays.toString(solution.nextGreaterElements(nums)));
    }
}