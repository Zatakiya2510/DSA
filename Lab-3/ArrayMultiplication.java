import java.util.Scanner;

public class ArrayMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m1 = new int[3][2];
        int[][] m2 = new int[2][3];
        int[][] result = new int[3][3];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
