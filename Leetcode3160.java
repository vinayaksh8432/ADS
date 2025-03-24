import java.util.*;

class Leetcode3160 {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballToColor = new HashMap<>();
        Map<Integer, Set<Integer>> colorToBalls = new HashMap<>();
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            if (ballToColor.containsKey(ball)) {
                int oldColor = ballToColor.get(ball);
                colorToBalls.get(oldColor).remove(ball);
                if (colorToBalls.get(oldColor).isEmpty()) {
                    colorToBalls.remove(oldColor);
                }
            }

            ballToColor.put(ball, color);
            colorToBalls.computeIfAbsent(color, k -> new HashSet<>()).add(ball);

            result[i] = colorToBalls.size();
        }

        return result;
    }

    public static void main(String[] args) {
        Leetcode3160 solution = new Leetcode3160();
        int[][] queries = { { 1, 4 }, { 2, 5 }, { 1, 3 }, { 3, 4 } };
        System.out.println(Arrays.toString(solution.queryResults(4, queries)));
    }
}