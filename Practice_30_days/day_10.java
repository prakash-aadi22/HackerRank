package Practice_30_days;

import java.util.Scanner;

public class day_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        while (n > 0) {
//            int remainder = n % 2;
//            n = n / 2;
//            System.out.print(remainder);
//        }

        int sum = 0, max = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                sum++;
                if (sum > max) {
                    max = sum;
                }
            } else {
                sum = 0;
            }
            n = n / 2;
        }
        System.out.println(max);
    }
}
