class Leetcode3174 {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Leetcode3174 solution = new Leetcode3174();
        System.out.println("Test case 1:");
        System.out.println(solution.clearDigits("abc123")); // Expected: "abc"
    }
}