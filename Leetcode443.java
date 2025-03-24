class Leetcode443 {
    public int compress(char[] chars) {
        int write = 0;
        int count = 1;

        for (int read = 1; read <= chars.length; read++) {
            if (read < chars.length && chars[read] == chars[read - 1]) {
                count++;
            } else {
                chars[write++] = chars[read - 1];
                if (count > 1) {
                    String countStr = String.valueOf(count);
                    for (char c : countStr.toCharArray()) {
                        chars[write++] = c;
                    }
                }
                count = 1;
            }
        }

        return write;
    }

    public static void main(String[] args) {
        Leetcode443 solution = new Leetcode443();
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println(solution.compress(chars));
    }
}