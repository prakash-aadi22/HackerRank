package Java_practice;

import java.util.*;

class Student {
    private int id;
    private String fName;
    private double cgpa;

    public Student(int id, String fName, double cgpa) {
        super();
        this.id = id;
        this.fName = fName;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFName() {
        return fName;
    }

    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class hr_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fName = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fName, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList, Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFName).thenComparing(Student::getId));

        for (Student st : studentList) {
            System.out.println(st.getFName());
        }
    }
}
