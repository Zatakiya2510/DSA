import java.util.*;

public class Recognize {
    public static boolean isValid(String rec) {
        if (!rec.contains("c")) {
            return false;
        }
        int index = rec.indexOf("c");

        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < index; i++) {
            st.push(rec.charAt(i));
        }

        for (int i = index + 1; i < rec.length(); i++) {
            if (st.empty()) {
                return false;
            }
            if (st.pop() != rec.charAt(i)) {
                return false;
            }
        }
        if (!st.empty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Stack To Recongize");
        String rec = sc.next();

        if (isValid(rec)) {
            System.out.println("String Is Valid");
        } else {
            System.out.println("String Is Invalid");
        }
    }
}
