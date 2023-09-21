import java.util.*;

public class InfixToPostfix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Infix String");
        String s = sc.nextLine();
        String postfix = convertInfixToPostfix(s);
        System.out.println("PostFix String " + postfix);
        sc.close();
    }

    public static String convertInfixToPostfix(String s) {
        String postfix = "";
        Stack<Character> st = new Stack<Character>();
        st.push('(');
        s += ')';
        int rank = 0;

        for (char i : s.toCharArray()) {
            if (Character.isLetterOrDigit(i)) {
                postfix += i + " ";
                rank++;
            } else if (i == '(') {
                st.push(i);
            } else if (i == ')') {
                while (!st.empty() && st.peek() != '(') {
                    postfix += st.pop() + "";
                }
                if (st.empty() || st.peek() != '(') {
                    return "Invalid Input String";
                } else {
                    st.pop();
                }

            } else if (isOperator(i)) {
                rank--;
                if (i == '^' || i == '$') {
                    st.push(i);
                } else {
                    while (!st.empty() && getPrecedence(i) <= getPrecedence(st.peek())) {
                        postfix += st.pop() + "";
                    }
                    st.push(i);
                }
            }
        }
        if (rank != 1) {
            return "Invalid Input String";
        }
        return postfix;
    }

    public static int getPrecedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 3;
            case '^':
            case '$':
                return 6;
        }
        return -1;
    }

    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '$';
    }
}
