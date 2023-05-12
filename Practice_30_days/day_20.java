package Practice_30_days;

import java.util.Scanner;

public class day_20 {

    private static void printArray(String s, int[] x) {
        System.out.print(s + " Array: ");
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] x) {
        printArray("Initial", x);

        int endPosition = x.length - 1;
        int swapPosition;

        while (endPosition > 0) {
            swapPosition = 0;

            for (int i = 0; i < endPosition; i++) {

                if (x[i] > x[i + 1]) {
                    // Swap elements 'i' and 'i + 1':
                    int tmp = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = tmp;

                    swapPosition = i;
                } // end if

                printArray("Current", x);
            } // end for

            endPosition = swapPosition;
        } // end while

        printArray("Sorted", x);
    } // end bubbleSort

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] unsorted = new int[n];
        for (int i = 0; i < n; i++) {
            unsorted[i] = sc.nextInt();
        }
        bubbleSort(unsorted);
        System.out.println("\n-----------------------------------------------------------------------------------------");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int numSwaps = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    numSwaps++;
                }
            }
            if (numSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length - 1]);
    }
}
