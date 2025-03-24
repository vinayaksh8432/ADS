class Leetcode1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int[] diff = new int[2];
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (count >= 2)
                    return false;
                diff[count++] = i;
            }
        }

        if (count == 0)
            return true;
        if (count != 2)
            return false;

        return s1.charAt(diff[0]) == s2.charAt(diff[1]) &&
                s1.charAt(diff[1]) == s2.charAt(diff[0]);
    }

    public static void main(String[] args) {
        Leetcode1790 solution = new Leetcode1790();
        System.out.println(solution.areAlmostEqual("bank", "kanb"));
    }
}