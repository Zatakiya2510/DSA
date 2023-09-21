import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DLL {
    Node head;

    public DLL() {
        this.head = null;
    }

    public void insertFront(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void deleteNode(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (position == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        Node current = head;
        int currentPosition = 0;

        while (current != null && currentPosition != position) {
            current = current.next;
            currentPosition++;
        }

        if (current == null) {
            System.out.println("Position not found.");
            return;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
    }

    public void insertEnd(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        if (current.prev != null) {
            current.prev.next = null;
        } else {
            head = null;
        }
    }

    public void display() {
        Node current = head;
        if (current == null) {
            Sysstem.out.println("Doubly Linked List Empty");
        }
        while (current != null) {
            System.out.print(" [ "+current.data + " ] ");
            current = current.next;
        }
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DLL list = new DLL();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nDoubly Linked List Operations:");
            System.out.println("1. Insert at front");
            System.out.println("2. Delete at position");
            System.out.println("3. Insert at end");
            System.out.println("4. Delete first node");
            System.out.println("5. Delete last node");
            System.out.println("6. Display all nodes");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            int data;
            Node newNode;
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    data = sc.nextInt();
                    newNode = new Node(data);
                    list.insertFront(newNode);
                    break;
                case 2:
                    System.out.print("Enter position to delete: ");
                    int position = sc.nextInt();
                    list.deleteNode(position);
                    break;
                case 3:
                    System.out.print("Enter value to insert: ");
                    data = sc.nextInt();
                    newNode = new Node(data);
                    list.insertEnd(newNode);
                    break;
                case 4:
                    list.deleteFirst();
                    break;
                case 5:
                    list.deleteLast();
                    break;
                case 6:
                    list.display();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}