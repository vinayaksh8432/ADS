class Leetcode344 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Leetcode344 solution = new Leetcode344();
        char[] s1 = { 'h', 'e', 'l', 'l', 'o' };
        System.out.println("Test case 1:");
        System.out.println("Before: " + new String(s1));
        solution.reverseString(s1);
        System.out.println("After: " + new String(s1));
    }
}