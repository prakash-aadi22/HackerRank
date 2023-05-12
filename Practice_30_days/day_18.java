package Practice_30_days;

import java.util.Scanner;
import java.util.LinkedList;

public class day_18 {

    private final LinkedList<Character> stack;
    private final LinkedList<Character> queue;

    public day_18() {
        this.stack = new LinkedList<>();
        this.queue = new LinkedList<>();
    }

    private char popCharacter() {
        return this.stack.pop();
    }

    private void pushCharacter(char c) {
        this.stack.push(c);
    }

    private char dequeueCharacter() {
        return this.queue.remove(0);
    }

    private void enqueueCharacter(char c) {
        this.queue.addLast(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original;
        StringBuilder reverse = new StringBuilder();
        original = sc.nextLine();
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse.append(original.charAt(i));
        }
        if (original.equals(reverse.toString())) {
            System.out.println("The word, " + original + ", is a palindrome.");
        } else {
            System.out.println("The word, " + original + ", is not a palindrome.");
        }
        System.out.println("-----------------------------------------------------------------------------------------");

        String input = sc.nextLine();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        day_18 p = new day_18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                           + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
