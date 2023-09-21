/**
 * CircleArea
 */
import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius Of Circle To Find Area");

        double r = sc.nextDouble();

        double area = calculateArea(r);

        System.out.println("The area of circle is :" + area);
    }

    public static double calculateArea(double r) {
        if (r < 0) {
            System.out.println("Invalid Number");
        }
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }
}