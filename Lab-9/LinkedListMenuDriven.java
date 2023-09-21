import java.util.Scanner;

/**
 * LinkedListMenuDriven
 */
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertFront(Node newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(" [ " + current.data + " ] ");
            current = current.next;
        }
        if (head == null) {
            System.out.println("Linked List Empty");
            return;
        }

    }

    public void deleteFront() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("Linked list is empty. Cannot delete from an empty list.");
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
        }
    }

    public void deleteEnd() {
        if (head == null || head.next == null) {
            head = null;
        } else {
            Node current = head;
            Node prev = null;
            while (current.next != null) {
                prev = current;
                current = current.next;
            }
            prev.next = null;
        }
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("Linked list is empty. Cannot delete from an empty list.");
            return;
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;
        int count = 1;

        while (current != null && count < position) {
            prev = current;
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Invalid position. No node found at position " + position);
        } else {
            prev.next = current.next;
        }
    }

    public void deleteNodeByValue(int data) {
        if (head == null) {
            return;
        }

        Node current = head;

        if (current.data == data) {
            head = head.next;
            return;
        }

        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void insertAfterPosition(Node newNode, int position) {
        if (position < 0) {
            return;
        }

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        int currentPosition = 0;

        while (current != null && currentPosition <= position) {
            if (currentPosition == position - 1) {
                newNode.next = current.next;
                current.next = newNode;
            }
            current = current.next;
            currentPosition++;
        }

        if (currentPosition == position) {
            current.next = newNode;
        }
    }
}

public class LinkedListMenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Insert at the front");
            System.out.println("2. Display all nodes");
            System.out.println("3. Delete the first node");
            System.out.println("4. Insert at the end");
            System.out.println("5. Delete the last node");
            System.out.println("6. Delete a node from specified position");
            System.out.println("7. Delete a node by value");
            System.out.println("8. Insert a value by position");
            System.out.println("9. Exit a program");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            int data, position;
            Node newNode;
            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at the front: ");
                    data = sc.nextInt();
                    newNode = new Node(data);
                    ll.insertFront(newNode);
                    break;
                case 2:
                    System.out.println("Linked list: ");
                    ll.display();
                    break;
                case 3:
                    ll.deleteFront();
                    break;
                case 4:
                    System.out.print("Enter data to insert at the end: ");
                    data = sc.nextInt();
                    newNode = new Node(data);
                    ll.insertEnd(newNode);
                    break;
                case 5:
                    ll.deleteEnd();
                    break;
                case 6:
                    System.out.print("Enter the position to delete node from: ");
                    position = sc.nextInt();
                    ll.deleteAtPosition(position);
                    break;
                case 7:
                    System.out.println("Enter Value To Delete Present In List");
                    data = sc.nextInt();
                    ll.deleteNodeByValue(data);
                    break;
                case 8:
                    System.out.println("Enter value to enter");
                    data = sc.nextInt();
                    newNode = new Node(data);
                    System.out.println("Enter position to enter new value/node");
                    position = sc.nextInt();
                    ll.insertAfterPosition(newNode, position);
                    break;
                case 9:
                    System.out.println("Exiting program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}