import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation1 {

    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '$' || ch == '^';
    }

    public static int evaluatePostfix(int operand1, int operand2, char ch) {
        int ans;
        switch (ch) {
            case '+':
                return operand2 + operand1;

            case '-':
                return operand2 - operand1;

            case '*':
                return operand2 * operand1;

            case '/':
                return operand2 / operand1;

            case '^':
            case '$':
                return (int) Math.pow(operand2, operand1);

            default:
                ans = 0;
        }
        return ans;
    }

    public static int evaPostfix(String exp) {
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isDigit(ch)) {
                st.push(Character.getNumericValue(ch));
            } else if (isOperator(ch)) {
                int operand2 = st.pop();
                int operand1 = st.pop();

                int ans = evaluatePostfix(operand1, operand2, ch);
                st.push(ans);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Expression ");
        String exp = sc.nextLine();
        int ans = evaPostfix(exp);
        System.out.println("Answer " + ans);
    }
}
