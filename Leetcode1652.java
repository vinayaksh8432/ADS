import java.util.Arrays;

class Leetcode1652 {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if (k == 0)
            return result;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
            } else {
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + n) % n];
                }
            }
            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        Leetcode1652 solution = new Leetcode1652();
        int[] code = { 5, 7, 1, 4 };
        System.out.println(Arrays.toString(solution.decrypt(code, 3)));
    }
}