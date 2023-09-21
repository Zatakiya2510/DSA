import java.util.Scanner;

/**
 * SmallestPosition
 */
public class SmallestPosition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int pos = 0;
        int min = a[0];

        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
                pos = i;
            }
        }
        System.out.println("Small Position Is:" + pos);
    }
}
