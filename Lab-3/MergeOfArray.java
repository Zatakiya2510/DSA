import java.util.Arrays;
import java.util.Scanner;

/**
 * MergeOfArray
 */
public class MergeOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of First Array");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Size Of First Array");
        int m = sc.nextInt();

        int b[] = new int[m];

        int c[] = new int[a.length+b.length];
        System.out.println("First Array :"+Arrays.toString(a));
        System.out.println("Second Array :"+Arrays.toString(b));
        for(int i=0; i<c.length; i++){
            if(a.length<=i){
                c[i]=b[i-a.length];
            }
            else{
                c[i]=a[i];
            }
        }
        System.out.println("Merged Array :"+Arrays.toString(c));

    }
}