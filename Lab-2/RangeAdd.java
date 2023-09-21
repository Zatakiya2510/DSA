import java.util.Scanner;

/**
 * RangeAdd
 */
public class RangeAdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Lower No.");
        int m = sc.nextInt();
        System.out.println("Enter Higher No.");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = m; i < n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum Of Array Between " + m + " and " + n + " is :" + sum);
    }
}
