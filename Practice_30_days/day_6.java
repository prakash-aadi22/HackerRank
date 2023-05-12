package Practice_30_days;

import java.util.Scanner;

public class day_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            char[] c = s.toCharArray();
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    System.out.print(c[j]);
                }
            }
            System.out.print(" ");
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 != 0) {
                    System.out.print(c[j]);
                }
            }
            System.out.println();
        }
    }
}
