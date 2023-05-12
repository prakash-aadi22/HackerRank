package Practice_30_days;

import java.util.Scanner;

class Result {
    public static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return n;
        }

//        if (n == 1) return 1;
//        return factorial(n - 1) * n;
    }
}

public class day_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Result.factorial(n));
    }
}
