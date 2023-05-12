package Algorithm;

import java.util.Scanner;

public class al_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n * n];
//        int sum1, sum2, diff, total = 0;
//        for (int i = 0; i < (n * n); i++) {
//            a[i] = sc.nextInt();
//            sum1 = a[0] + a[4] + a[8];
//            sum2 = a[2] + a[4] + a[6];
//            diff = sum1 - sum2;
//            total = Math.abs(diff);
//        }
//        System.out.println(total);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int dia1 = 0;
        int dia2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                if (i == j)
                    dia1 = dia1 + a[i][j];
                if (i == n - 1 - j)
                    dia2 = dia2 + a[i][j];
            }
        }
        System.out.println(Math.abs(dia1 - dia2));
    }
}
