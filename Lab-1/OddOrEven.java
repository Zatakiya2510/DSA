import java.util.Scanner;

/**
 * OddOrEven
 */
public class OddOrEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter Number To Check Whether Odd Or Even");
        a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("Number Is Even " + a);
        } else {
            System.out.println("Number Is Odd " + a);
        }
    }
}