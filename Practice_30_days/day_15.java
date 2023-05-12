package Practice_30_days;

import java.util.Arrays;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class day_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        for (int i : a) {
            System.out.print(i + " ");
        }

        System.out.println("\n-----------------------------------------------------------------------------------------");

        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }

    public static Node insert(Node head, int data) {
        if (head == null) head = new Node(data);
        else {
            Node curr = head;
            while (curr.next != null) curr = curr.next;
            curr.next = new Node(data);
        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

}
