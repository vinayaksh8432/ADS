import java.util.HashMap;

class Leetcode76 {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int minLeft = 0;
        int minLen = s.length() + 1;
        int count = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) >= 0) {
                    count++;
                }
            }

            while (count == t.length()) {
                if (right - left + 1 < minLen) {
                    minLeft = left;
                    minLen = right - left + 1;
                }

                char leftChar = s.charAt(left);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        count--;
                    }
                }
                left++;
            }
        }

        return minLen > s.length() ? "" : s.substring(minLeft, minLeft + minLen);
    }

    public static void main(String[] args) {
        Leetcode76 solution = new Leetcode76();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(solution.minWindow(s, t));
    }
}