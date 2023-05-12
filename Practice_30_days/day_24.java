package Practice_30_days;

import java.util.Scanner;

class Node3 {
    int data3;
    Node3 next3;

    Node3(int d) {
        data3 = d;
        next3 = null;
    }
}

public class day_24 {

    public static void removeDuplicates(Node3 head3) {
        Node3 curr3 = head3;
        while (curr3 != null && curr3.next3 != null) {
            while (curr3.next3 != null && curr3.data3 == curr3.next3.data3) {
                curr3.next3 = curr3.next3.next3;
            }
            curr3 = curr3.next3;
        }
    }

    public static Node3 insert(Node3 head3, int data3) {
        Node3 p3 = new Node3(data3);
        if (head3 == null)
            head3 = p3;
        else if (head3.next3 == null)
            head3.next3 = p3;
        else {
            Node3 start3 = head3;
            while (start3.next3 != null)
                start3 = start3.next3;
            start3.next3 = p3;

        }
        return head3;
    }

    public static void display(Node3 head3) {
        Node3 start3 = head3;
        while (start3 != null) {
            System.out.print(start3.data3 + " ");
            start3 = start3.next3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = 0;
        for (int i = 0; i < n; i++) {
            m = Math.max(m, a[i]);
        }
        int[] f = new int[m + 1];
        for (int i = 0; i < m + 1; i++) {
            f[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            f[a[i]]++;
        }
        for (int i = 0; i < m + 1; i++) {
            if (f[i] > 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n-----------------------------------------------------------------------------------------");
        Node3 head3 = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head3 = insert(head3, ele);
        }
        removeDuplicates(head3);
        display(head3);
    }
}
