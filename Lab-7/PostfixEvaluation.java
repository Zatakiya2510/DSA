import java.util.*;

public class PostfixEvaluation {
    public static int evaluatePostfix(String exp) {
        Stack<Integer> st = new Stack<Integer>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isDigit(c)) {
                st.push(c - '0');
            } else {
                int operand2 = st.pop();
                int operand1 = st.pop();
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

                st.push(result);
            }
        }

        return st.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a postfix expression: ");
        String exp = sc.nextLine();

        int result = evaluatePostfix(exp);
        System.out.println("Result: " + result);
        sc.close();
    }
}
