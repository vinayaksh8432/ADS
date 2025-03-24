class Leetcode2698 {
    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (isValid(i * i, i)) {
                sum += i * i;
            }
        }
        return sum;
    }

    private boolean isValid(int square, int target) {
        String s = String.valueOf(square);
        return dfs(s, target, 0, 0);
    }

    private boolean dfs(String s, int target, int index, int sum) {
        if (index == s.length()) {
            return sum == target;
        }

        int num = 0;
        for (int i = index; i < s.length(); i++) {
            num = num * 10 + (s.charAt(i) - '0');
            if (dfs(s, target, i + 1, sum + num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Leetcode2698 solution = new Leetcode2698();
        System.out.println(solution.punishmentNumber(10));
        System.out.println(solution.punishmentNumber(37));
    }
}