import java.util.Scanner;
import java.util.Arrays;
/**
 * ArrayInsertion
 */
public class ArrayInsertion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        int a[] = new int[n+1];
        System.out.println("Enter Element Of An Array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Number To Add In Array");
        int num = sc.nextInt();
        System.out.println("Enter Location To Add In Array");
        int location = sc.nextInt();


        System.out.println("Orignal Array :"+Arrays.toString(a));
        for(int i= a.length-1;i!=location;i--){
            a[i] = a[i-1];
        }
        
        
        a[location] = num;
        System.out.println("New Array : "+Arrays.toString(a));
    }
}