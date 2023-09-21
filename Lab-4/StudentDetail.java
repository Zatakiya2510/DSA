import java.util.Scanner;

class Student_Detail {
    private int enrollmentNo;
    private String name;
    private int semester;
    private double cpi;

    public Student_Detail(int enrollmentNo, String name, int semester, double cpi) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.semester = semester;
        this.cpi = cpi;
    }

    public int getEnrollmentNo() {
        return enrollmentNo;
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    public double getCPI() {
        return cpi;
    }
}

public class StudentDetail {
    public static void main(String[] args) {
        Student_Detail[] students = new Student_Detail[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");

            System.out.print("Enrollment No: ");
            int enrollmentNo = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Semester: ");
            int semester = sc.nextInt();

            System.out.print("CPI: ");
            double cpi = sc.nextDouble();

            students[i] = new Student_Detail(enrollmentNo, name, semester, cpi);
        }

        System.out.println("Student Details:");
        for (Student_Detail student : students) {
            System.out.println("Enrollment No: " + student.getEnrollmentNo());
            System.out.println("Name: " + student.getName());
            System.out.println("Semester: " + student.getSemester());
            System.out.println("CPI: " + student.getCPI());
            System.out.println();
        }
    }
}
