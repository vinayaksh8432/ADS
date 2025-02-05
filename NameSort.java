import java.util.Scanner;

public class NameSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = { "abc", "def", "ghi", "jkl", "mno" };
        String[] rollStr = { "1", "3", "-4", "2", "five" };
        int[] rollNo = new int[rollStr.length];

        for (int i = 0; i < rollStr.length; i++) {
            try {
                rollNo[i] = Integer.parseInt(rollStr[i]);
            } catch (NumberFormatException e) {
                rollNo[i] = 0;
            }
        }

        for (int i = 0; i < rollNo.length; i++) {
            for (int j = 0; j < rollNo.length - 1 - i; j++) {
                if (rollNo[j] > rollNo[j + 1]) {
                    int tempNo = rollNo[j];
                    rollNo[j] = rollNo[j + 1];
                    rollNo[j + 1] = tempNo;
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " " + rollNo[i]);
        }

        sc.close();
    }
}