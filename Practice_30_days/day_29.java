package Practice_30_days;

import java.util.Scanner;

public class day_29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int max = 0;
            for (int j = 1; j < N; j++) {
                for (int k = j + 1; k <= N; k++) {
                    int h = j & k;
                    if (h < K && max < h) max = h;
                }
            }
            System.out.println(max);
        }
    }
}
