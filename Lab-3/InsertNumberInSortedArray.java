import java.util.Arrays;
import java.util.Scanner;

public class InsertNumberInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int a[] = new int[n+1];
        System.out.println("Enter Element Of An Array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter No. To Insert");
        int num = sc.nextInt();
        int pos = 0;
        for(int i=0;i<n;i++){
            if(a[i]<num){
                pos++; 
            }
            else {
                break;
            }
        }
        System.out.println("Orignal Array "+Arrays.toString(a));
        for(int i=n; i>pos ;i--){
            a[i] = a[i-1];
        }
        a[pos] = num;

        System.out.println("New Array "+Arrays.toString(a));


    }
}
