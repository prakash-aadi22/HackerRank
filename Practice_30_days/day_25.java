package Practice_30_days;

import java.util.Scanner;

public class day_25 {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j : a) {
            if (j >= 2 && isPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n1 = sc.nextInt();
            if (n1 >= 2 && isPrime(n1))
                System.out.println("Prime");
            else System.out.println("Not prime");
        }
    }
}
