package Algorithm;

import java.util.Scanner;

public class al_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long j = sc.nextInt();
            sum += j;
        }
        System.out.println(sum);
    }
}
