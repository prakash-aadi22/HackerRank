package Algorithm;

import java.util.Scanner;

public class al_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 0, neg = 0, zero = 0;
        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            if (j > 0) {
                pos++;
            } else if (j < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        System.out.println((float) pos / n);
        System.out.println((float) neg / n);
        System.out.println((float) zero / n);
    }
}
