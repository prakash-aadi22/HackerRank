package Java_practice;

import java.util.*;

/*
 * Create the Java_practice.Student and Priorities classes here.
 */

class Student1 {
    private int token1;
    private String fname1;
    private double cgpa1;

    public Student1(int id1, String fname1, double cgpa1) {
        super();
        this.token1 = id1;
        this.fname1 = fname1;
        this.cgpa1 = cgpa1;
    }

    public int getToken1() {
        return token1;
    }

    public String getName1() {
        return fname1;
    }

    public double getCgpa1() {
        return cgpa1;
    }
}

class Priorities1 {
    public List < Student1 > getStudents1(List < String > events1) {
        PriorityQueue < Student1 > student_queue1 = new PriorityQueue(Comparator.comparing(Student1::getCgpa1).reversed().thenComparing(Student1::getName1).thenComparing(Student1::getToken1));
        List < Student1 > students1 = new ArrayList < Student1 > ();
        for (String e1: events1) {
            Scanner in1 =new Scanner(e1);
            String event1 = in1.next();
            if (event1.equals("ENTER")) {
                String name1 = in1.next();
                float cgpa1 = in1.nextFloat();
                int token1 = in1.nextInt();

                Student1 student1 = new Student1(token1, name1, cgpa1);
                student_queue1.add(student1);
            } else if (event1.equals("SERVED")) {
                Student1 first1 = student_queue1.poll();
            } in1 .close();
        }
        Student1 first1 = student_queue1.poll();
        if (first1 == null) {
            return students1;
        } else {
            while (first1 != null) {

                students1.add(first1);
                first1 = student_queue1.poll();

            }
            return students1;
        }

    }
}

public class hr_13 {
    private final static Scanner scan1 = new Scanner(System.in);
    private final static Priorities1 priorities1 = new Priorities1();

    public static void main(String[] args) {
        int totalEvents1 = Integer.parseInt(scan1.nextLine());
        List<String> events1 = new ArrayList<>();

        while (totalEvents1-- != 0) {
            String event1 = scan1.nextLine();
            events1.add(event1);
        }

        List<Student1> students1 = priorities1.getStudents1(events1);

        if (students1.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student1 st1: students1) {
                System.out.println(st1.getName1());
            }
        }
    }
}
