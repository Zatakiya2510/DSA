import java.util.Scanner;

public class DisplayAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element Of An Array");
            a[i] = sc.nextInt();
        }
        for (int temp : a) {
            System.out.print(temp + ",");
        }
    }
}
