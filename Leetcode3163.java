class Leetcode3163 {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char prev = word.charAt(0);

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == prev && count < 9) {
                count++;
            } else {
                sb.append(count).append(prev);
                count = 1;
                prev = word.charAt(i);
            }
        }
        sb.append(count).append(prev);

        return sb.toString();
    }

    public static void main(String[] args) {
        Leetcode3163 solution = new Leetcode3163();
        System.out.println(solution.compressedString("abcde"));
    }
}