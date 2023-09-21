import java.util.Scanner;

/**
 * CircularQueue
 */
public class CircularQueue {

    int[] q;
    int front;
    int rear;
    int size;

    public CircularQueue(int size) {
        this.size = size;
        this.q = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == size - 1) || (front == rear + 1);
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int num) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        } else if (front == -1) {
            front = rear = 0;
        } else if (rear == size - 1) {
            rear = 0;
        } else {
            rear++;
        }
        q[rear] = num;
        System.out.println("Enqueued Element: " + num);
    }

    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int temp = q[front];
        if (front == rear) {
            front = rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
        return temp;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
        } else {

            if (rear >= front) {
                for (int i = front; i <= rear; i++) {
                    System.out.println("Elements in the circular queue: " + q[i]);
                }
            } else {
                for (int i = front; i < q.length; i++) {
                    System.out.println("Elements in the circular queue: " + q[i]);
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.println("Elements in the circular queue: " + q[i]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Circular Queue");
        int size = sc.nextInt();
        CircularQueue cq = new CircularQueue(size);

        while (true) {
            System.out.println("\nCircular Queue Operations:");
            System.out.println("1 Insert");
            System.out.println("2 Delete");
            System.out.println("3 Display");
            System.out.println("4 Exit");

            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Element To Insert");
                    int num = sc.nextInt();
                    cq.enqueue(num);
                    break;

                case 2:
                    cq.dequeue();
                    break;

                case 3:
                    cq.display();
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
