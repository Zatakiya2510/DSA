import java.util.Scanner;

public class NumberSwape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Before swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        swapNumbers(num1, num2);
    }

    public static void swapNumbers(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}
