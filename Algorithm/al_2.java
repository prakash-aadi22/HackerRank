package Algorithm;

import java.util.Scanner;

public class al_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            sum += j;
        }
        System.out.println(sum);
    }
}
