import java.util.Scanner;

public class Employee_Detail {
    private int employeeID;
    private String name;
    private String designation;
    private double salary;

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee_Detail employee = new Employee_Detail();

        System.out.print("Enter Employee ID: ");
        int employeeID = scanner.nextInt();
        employee.setEmployeeID(employeeID);

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        employee.setName(name);

        System.out.print("Enter Designation: ");
        String designation = scanner.nextLine();
        employee.setDesignation(designation);

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        employee.setSalary(salary);

        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employee.getEmployeeID());
        System.out.println("Name: " + employee.getName());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Salary: " + employee.getSalary());
    }
}
