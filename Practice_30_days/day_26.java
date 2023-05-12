package Practice_30_days;

import java.util.Scanner;

public class day_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int da = sc.nextInt();
        int ma = sc.nextInt();
        int ya = sc.nextInt();

        int de = sc.nextInt();
        int me = sc.nextInt();
        int ye = sc.nextInt();

        int fine = 0;

        if (ya > ye) {
            fine = 10000;
        } else if (ya == ye) {
            if (ma > me) {
                fine = (ma - me) * 500;
            } else if (ma == me && da > de) {
                fine = (da - de) * 15;
            }
        }

        System.out.println(fine);
    }
}
