import java.util.Scanner;

/**
 * Factors
 */
public class Factors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int n= sc.nextInt();

        for(int i = 1; i<=n; i++){
            if(n%i==0){
                System.out.println("Factors Are :"+i);
            }
        }
    }
}