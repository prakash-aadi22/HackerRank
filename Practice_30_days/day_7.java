package Practice_30_days;

import java.util.Scanner;

public class day_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int idx = n - i - 1;
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
        for(int i = n - 1; i > -1; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
