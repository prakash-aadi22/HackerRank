package Practice_30_days;

import java.util.Scanner;

public class day_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        try {
            Integer integer = Integer.parseInt(string);
            System.out.println(integer);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Bad String");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        try {
            int n = sc.nextInt();
            System.out.println(n);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}
