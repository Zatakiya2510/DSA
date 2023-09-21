import java.util.Scanner;

public class MenuDriven {
    private int[] a;
    private int top;

    public MenuDriven(int size) {
        a = new int[size];
        top = -1;
    }

    public void push(int n) {
        if (top >= a.length - 1) {
            System.out.println("Stack is full. Cannot push item.");
        } else {
            a[++top] = n;
            System.out.println("Pushed " + n + " onto the stack.");
        }
    }

    public void pop() {
        if (top <= 0) {
            System.out.println("Stack is empty.");
        } else {
            int n = a[top--];
            System.out.println("Popped " + n + " from the stack.");
        }
    }

    public void display() {
        if (top <= 0) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack Contents:");
            for (int i = top; i >= 0; i--) {
                System.out.println(a[i]);
            }
        }
    }

    public void peep(int i) {
        if (top <= 0) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top of the stack: " + a[top - i + 1]);
        }
    }

    public int change(int index, int new_n) {
        if (top <= 0) {
            System.out.println("Stack is empty.");
        }
        return a[top - index + 1] = new_n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum size of the stack: ");
        int size = sc.nextInt();
        MenuDriven s = new MenuDriven(size);

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1 Push");
            System.out.println("2 Pop");
            System.out.println("3 Display");
            System.out.println("4 Peep");
            System.out.println("5 Change");
            System.out.println("6 Exit");

            System.out.print("Enter your choice (1-6): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item to push onto the stack: ");
                    int n = sc.nextInt();
                    s.push(n);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.print("Enter the index of the item to change: ");
                    int i = sc.nextInt();
                    s.peep(i);
                    break;
                case 5:
                    System.out.print("Enter the index of the item to change: ");
                    int index = sc.nextInt();
                    System.out.print("Enter item to push onto the stack: ");
                    int new_n = sc.nextInt();
                    s.change(index, new_n);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
