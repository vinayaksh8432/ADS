import java.util.*;

class Leetcode901 {
    private Stack<int[]> stack;

    public Leetcode901() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.push(new int[] { price, span });
        return span;
    }

    public static void main(String[] args) {
        Leetcode901 solution = new Leetcode901();
        System.out.println(solution.next(100));
        System.out.println(solution.next(80));
        System.out.println(solution.next(60));
        System.out.println(solution.next(70));
        System.out.println(solution.next(60));
        System.out.println(solution.next(75));
        System.out.println(solution.next(85));
    }
}