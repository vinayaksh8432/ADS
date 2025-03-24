import java.util.HashMap;

class Leetcode340 {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (k == 0)
            return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Leetcode340 solution = new Leetcode340();
        String s = "eceba";
        int k = 2;
        System.out.println(solution.lengthOfLongestSubstringKDistinct(s, k));
    }
}