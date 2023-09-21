import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element Of An Array");
            a[i] = sc.nextInt();

        }
        int duplicateIndex = 0;
        int duplicate = a[duplicateIndex];

        for (int i = 0; i < n; i++) {
            if (a[i] == duplicate) {
                duplicate = a[i];
                duplicateIndex = i;
            }
        }
        if (duplicate == 0) {
            System.out.println("No Duplicate Number Found");
        } else {
            System.out.println("Duplicate Number Found ");
        }
    }
}
