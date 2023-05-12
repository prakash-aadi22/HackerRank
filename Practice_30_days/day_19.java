package Practice_30_days;

import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator1 implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }
}

public class day_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("I implemented: AdvancedArithmetic");
        int mySum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                mySum += i;
            }
        }
        System.out.println(mySum);
        System.out.println("-----------------------------------------------------------------------------------------");
        AdvancedArithmetic myCalculator = new Calculator1();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0]);
        System.out.println("I implemented: " + myCalculator.getClass().getName());
        System.out.println(sum);
    }
}
