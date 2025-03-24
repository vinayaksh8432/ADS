class Leetcode1910 {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.indexOf(part) != -1) {
            int index = sb.indexOf(part);
            sb.delete(index, index + part.length());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Leetcode1910 solution = new Leetcode1910();
        System.out.println("Test case 1:");
        System.out.println(solution.removeOccurrences("daabcbaabcbc", "abc"));
    }
}