import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;

    Stack() {
        this.top = null;
    }

    public void push(Node newNode) {
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println(newNode.data + " pushed onto the stack.");
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            int poppedData = top.data;
            top = top.next;
            System.out.println(poppedData + " popped from the stack.");
            return poppedData;
        }
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return top.data;
        }
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack contents:");
            Node current = top;
            while (current != null) {
                System.out.print(" [ " + current.data + " ] ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public void change(int oldData, int newData) {
        Node current = top;
        boolean found = false;
        while (current != null) {
            if (current.data == oldData) {
                current.data = newData;
                System.out.println(oldData + " changed to " + newData + " in the stack.");
                found = true;
                break;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println(oldData + " not found in the stack.");
        }
    }
}

public class StcakUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. DISPLAY");
            System.out.println("4. PEEK");
            System.out.println("5. CHANGE");
            System.out.println("6. EXIT");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            int data;
            Node newNode;

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    data = sc.nextInt();
                    newNode = new Node(data);
                    stack.push(newNode);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    int peekValue = stack.peek();
                    if (peekValue != -1) {
                        System.out.println("Peek value: " + peekValue);
                    }
                    break;

                case 5:
                    System.out.print("Enter value to change: ");
                    int oldValue = sc.nextInt();
                    System.out.print("Enter new value: ");
                    int newValue = sc.nextInt();
                    stack.change(oldValue, newValue);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
