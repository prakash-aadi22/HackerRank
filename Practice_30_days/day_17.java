package Practice_30_days;

import java.util.Scanner;

class Calculator {
    public int power(int n, int p) throws Exception {
        if (n < 0 || p < 0)
            throw new Exception("n and p should be non-negative");
        return (int) Math.pow(n, p);
    }
}

public class day_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
