import java.util.*;

class Leetcode1980 {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        Set<String> set = new HashSet<>();
        for (String num : nums) {
            set.add(num);
        }

        for (int i = 0; i < (1 << n); i++) {
            String binary = Integer.toBinaryString(i);
            while (binary.length() < n) {
                binary = "0" + binary;
            }
            if (!set.contains(binary)) {
                return binary;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Leetcode1980 solution = new Leetcode1980();
        String[] nums = { "01", "10" };
        System.out.println(solution.findDifferentBinaryString(nums));
    }
}