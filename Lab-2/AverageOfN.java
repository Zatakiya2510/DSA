import java.util.Scanner;

/**
 * AverageOfN
 */
public class AverageOfN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        float avg = sum / n;
        System.out.println("Average Of N Number Is :" + avg);
    }

}
