class Leetcode1718 {
    public int[] constructDistancedSequence(int n) {
        int[] result = new int[2 * n - 1];
        boolean[] used = new boolean[n + 1];

        if (dfs(result, used, 0, n)) {
            return result;
        }
        return new int[0];
    }

    private boolean dfs(int[] result, boolean[] used, int pos, int n) {
        if (pos == result.length) {
            return true;
        }

        if (result[pos] != 0) {
            return dfs(result, used, pos + 1, n);
        }

        for (int i = n; i > 0; i--) {
            if (used[i])
                continue;

            if (i == 1) {
                result[pos] = 1;
                used[1] = true;
                if (dfs(result, used, pos + 1, n))
                    return true;
                used[1] = false;
                result[pos] = 0;
            } else {
                if (pos + i < result.length && result[pos + i] == 0) {
                    result[pos] = i;
                    result[pos + i] = i;
                    used[i] = true;
                    if (dfs(result, used, pos + 1, n))
                        return true;
                    used[i] = false;
                    result[pos] = 0;
                    result[pos + i] = 0;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Leetcode1718 solution = new Leetcode1718();
        int[] result = solution.constructDistancedSequence(3);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}