import java.util.Scanner;
import java.util.Arrays;

/**
 * ArrayInsertion
 */
public class ArrayDeletion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Element Of An Array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter Location To Delete In Array");
        int location = sc.nextInt();

        System.out.println("Orignal Array :" + Arrays.toString(a));
        for (int i = location; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }

        a[a.length - 1] = 0;
        System.out.println("New Array : " + Arrays.toString(a));
    }
}