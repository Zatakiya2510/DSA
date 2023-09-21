import java.util.Arrays;
import java.util.Scanner;

public class DeleteNumberFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the number to be deleted: ");
        int num = sc.nextInt();
        int pos=-1;
        for(int i=0; i<a.length; i++){
            if(a[i]==num){
                pos=i;
                break;
            }
        }
        System.out.println("original Array "+Arrays.toString(a));
        if (pos == -1) {
            System.out.println("Invalid Number");
        } else {
            for(int i=pos; i<n-1; i++){
                a[i]= a[i+1];
            }
        }
        a[a.length-1] = 0;
        System.out.println("New Array "+Arrays.toString(a));
    }
}