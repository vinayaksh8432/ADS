class Leetcode214 {
    public String shortestPalindrome(String s) {
        String temp = s + "#" + new StringBuilder(s).reverse().toString();
        int[] table = new int[temp.length()];

        for (int i = 1; i < temp.length(); i++) {
            int j = table[i - 1];
            while (j > 0 && temp.charAt(i) != temp.charAt(j)) {
                j = table[j - 1];
            }
            if (temp.charAt(i) == temp.charAt(j)) {
                j++;
            }
            table[i] = j;
        }

        return new StringBuilder(s.substring(table[temp.length() - 1])).reverse().toString() + s;
    }

    public static void main(String[] args) {
        Leetcode214 solution = new Leetcode214();
        System.out.println(solution.shortestPalindrome("aacecaaa"));
    }
}