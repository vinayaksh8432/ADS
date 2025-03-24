import java.util.Arrays;

class Leetcode16 {
    public int threeSumClosest(int[] nums, int target) {
        int closest = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target)
                    return sum;

                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum < target)
                    left++;
                else
                    right--;
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        Leetcode16 solution = new Leetcode16();
        int[] nums = { -1, 2, 1, -4 };
        System.out.println(solution.threeSumClosest(nums, 1));
    }
}