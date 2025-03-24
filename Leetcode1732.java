class Leetcode1732 {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;

        for (int g : gain) {
            currentAltitude += g;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        Leetcode1732 solution = new Leetcode1732();
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println(solution.largestAltitude(gain));
    }
}