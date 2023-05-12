package Practice_30_days;

import java.util.Scanner;

class Difference {
    private final int[] elements1;
    public int maximumDifference;

    Difference(int[] elements2) {
        this.elements1 = elements2;
    }

    public void computeDifference() {
        int max = 0;
//        for (int i = 0; i < elements.length; i++) {
//            for (int j = 0; j < elements.length; j++) {
        for (int i : elements1) {
            for (int j : elements1) {
                int abs = Math.abs(i - j);
                if (abs > max) max = abs;
            }
        }

        maximumDifference = max;
    }
}

public class day_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
        for (int i : a) {
            for (int j : a) {
                int abs = Math.abs(i - j);
                if (abs > max) max = abs;
            }
        }
        System.out.println(max);
        System.out.println("-----------------------------------------------------------------------------------------");

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
