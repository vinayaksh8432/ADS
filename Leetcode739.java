import java.util.*;

class Leetcode739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Leetcode739 solution = new Leetcode739();
        int[] temperatures1 = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] result1 = solution.dailyTemperatures(temperatures1);
        System.out.println("Test case 1:");
        System.out.println(Arrays.toString(result1));
    }
}