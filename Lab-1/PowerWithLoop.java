import java.util.Scanner;

class PowerWithLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base Of No. :");
        int base = sc.nextInt();
        System.out.println("Enter Exponent Of No. :");
        int exponent = sc.nextInt();

        float result = 1;

        while (exponent != 0) {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
    }
}