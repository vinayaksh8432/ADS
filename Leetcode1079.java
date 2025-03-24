import java.util.*;

class Leetcode1079 {
    public int numTilePossibilities(String tiles) {
        int[] count = new int[26];
        for (char c : tiles.toCharArray()) {
            count[c - 'A']++;
        }
        return dfs(count);
    }

    private int dfs(int[] count) {
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                sum++;
                count[i]--;
                sum += dfs(count);
                count[i]++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Leetcode1079 solution = new Leetcode1079();
        System.out.println(solution.numTilePossibilities("AAB"));
        System.out.println(solution.numTilePossibilities("AAABBC"));
    }
}