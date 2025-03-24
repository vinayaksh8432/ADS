class Leetcode509 {
    public int fib(int n) {
        if (n <= 1)
            return n;

        int prev = 0;
        int curr = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }

    public static void main(String[] args) {
        Leetcode509 solution = new Leetcode509();
        System.out.println("Test case 1:");
        System.out.println(solution.fib(2)); // Expected: 1
    }
}