import java.util.*;

public class SizeOfStack {
    public static boolean isValid(String s) {
        Stack<Character> s1 = new Stack<Character>();

        Stack<Character> s2 = new Stack<Character>();

        if (!s.contains("b")) {
            return false;
        }
        int index = s.indexOf("b");

        for (int i = 0; i < index; i++) {
            if (s.charAt(i) == 'a') {
                s1.push(s.charAt(i));
            } else {
                return false;
            }
        }

        for (int i = index; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                s2.push(s.charAt(i));
            } else {
                return false;
            }
        }
        if (s1.size() == s2.size()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String Which Contains A And B");
        String s = sc.next();

        if (isValid(s)) {
            System.out.println("String Is Valid");
        } else {
            System.out.println("String Is Invalid");
        }
    }
}