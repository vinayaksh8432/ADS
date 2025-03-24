import java.util.*;

class Leetcode316 {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        boolean[] seen = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (seen[c - 'a'])
                continue;

            while (!stack.isEmpty() &&
                    stack.peek() > c &&
                    lastIndex[stack.peek() - 'a'] > i) {
                seen[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            seen[c - 'a'] = true;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Leetcode316 solution = new Leetcode316();
        String s = "bcabc";
        System.out.println(solution.removeDuplicateLetters(s));
    }
}