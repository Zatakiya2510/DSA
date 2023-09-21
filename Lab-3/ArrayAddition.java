import java.util.Scanner;
import java.util.Arrays;

/**
 * 2DArrayAddition
 */
public class ArrayAddition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m1 = new int[2][2];
        int[][] m2 = new int[2][2];
        int[][] ans = new int[2][2];

        System.out.println("Enter Element Of Matrix M1");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Element Of Matrix M2");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ans[i][j] = m1[i][j] + m2[i][j];
            }
        }

        for (int[] a : ans) {
            for (int temp : a) {
                System.out.println("Sum Of Two Matrix Is :" + temp);

            }
        }
    }
}