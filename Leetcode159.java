import java.util.*;

class Leetcode159 {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s.length() <= 2)
            return s.length();

        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int maxLen = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.size() > 2) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Leetcode159 solution = new Leetcode159();
        String s = "eceba";
        System.out.println(solution.lengthOfLongestSubstringTwoDistinct(s));
    }
}