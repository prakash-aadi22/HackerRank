package Practice_30_days;

import java.util.Scanner;
class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
}

class Student extends Person {
    private final int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);

        this.testScores = testScores;
    }

    char calculate() {
        int total = 0;

        for (int testScore : testScores) total += testScore;

        int avg = total / testScores.length;

        if (avg >= 90 && avg <= 100) return 'O';
        if (avg >= 80 && avg < 90) return 'E';
        if (avg >= 70 && avg < 80) return 'A';
        if (avg >= 55 && avg < 70) return 'P';
        if (avg >= 40 && avg < 55) return 'D';
        return 'T';
    }
}
public class day_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        int id = sc.nextInt();
        int noOfScore = sc.nextInt();
        int totalScore = 0;
        for (int i = 0; i < noOfScore; i++) {
            int score = sc.nextInt();
            totalScore += score;
        }
        int average = totalScore / noOfScore;
        System.out.println();
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + id);
        System.out.print("Grade: ");
        if (90 <= average && average <= 100) {
            System.out.println("O");
        } else if (80 <= average && average < 90) {
            System.out.println("E");
        } else if (70 <= average && average < 80) {
            System.out.println("A");
        } else if (55 <= average && average < 70) {
            System.out.println("P");
        } else if (40 <= average && average < 55) {
            System.out.println("D");
        } else {
            System.out.println("T");
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        int numScores = sc.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = sc.nextInt();
        }
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
