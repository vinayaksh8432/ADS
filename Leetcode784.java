import java.util.*;

class Leetcode784 {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), 0, result);
        return result;
    }

    private void backtrack(char[] chars, int index, List<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        if (Character.isLetter(chars[index])) {
            chars[index] = Character.toUpperCase(chars[index]);
            backtrack(chars, index + 1, result);
            chars[index] = Character.toLowerCase(chars[index]);
        }
        backtrack(chars, index + 1, result);
    }

    public static void main(String[] args) {
        Leetcode784 solution = new Leetcode784();
        System.out.println("Test case 1:");
        List<String> result1 = solution.letterCasePermutation("a1b2");
        for (String s : result1) {
            System.out.println(s);
        }
    }
}