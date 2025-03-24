class Leetcode1415 {
    public String getHappyString(int n, int k) {
        int total = 3 * (1 << (n - 1));
        if (k > total)
            return "";

        StringBuilder result = new StringBuilder();
        char[] chars = { 'a', 'b', 'c' };
        k--;

        for (int i = 0; i < n; i++) {
            int pos = k / (1 << (n - 1 - i));
            if (i == 0) {
                result.append(chars[pos]);
            } else {
                char prev = result.charAt(i - 1);
                for (char c : chars) {
                    if (c != prev) {
                        if (pos == 0) {
                            result.append(c);
                            break;
                        }
                        pos--;
                    }
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Leetcode1415 solution = new Leetcode1415();
        System.out.println("Test case 1:");
        System.out.println(solution.getHappyString(1, 3));
    }
}