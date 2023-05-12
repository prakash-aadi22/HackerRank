package Practice_30_days;

import java.util.Scanner;

public class day_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mealCost = sc.nextDouble();
        int tipPercent = sc.nextInt();
        int taxPercent = sc.nextInt();
        sc.close();
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
        int totalCost = (int) Math.round(mealCost + tip + tax);
        System.out.println(totalCost);
    }
}
