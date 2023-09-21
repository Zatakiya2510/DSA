import java.util.Stack;
import java.util.Scanner;

public class PrefixEvaluation {
    public static int evaluatePrefix(String exp) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char c = exp.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                int result;

                switch (c) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    case '%':
                        result = operand1 % operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + c);
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a prefix expression: ");
        String exp = sc.nextLine();

        int result = evaluatePrefix(exp);
        System.out.println("Result: " + result);
    }
}
