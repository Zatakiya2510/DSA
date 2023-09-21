import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front;
    Node rear;

    Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(Node newNode) {
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(newNode.data + " enqueued into the queue.");
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        } else {
            int dequeuedData = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            System.out.println(dequeuedData + " dequeued from the queue.");
            return dequeuedData;
        }
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue contents:");
            Node current = front;
            while (current != null) {
                System.out.print(" [ " + current.data + " ] ");
                current = current.next;
            }
            System.out.println();
        }
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int data = sc.nextInt();
                    Node newNode = new Node(data);
                    queue.enqueue(newNode);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
