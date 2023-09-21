import java.util.Scanner;

/**
 * Queue
 */
public class SimpleQueue {

    int[] q;
    int front;
    int rear;
    int size;

    public SimpleQueue(int size) {
        this.q = new int[size];
        this.front = -1;
        this.rear = -1;
        this.size = size;
    }

    public void enqueue(int num) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        } else {
            q[++rear] = num;
        }
        if (front == -1) {
            front = 0;
        }
        System.out.println("Enqueued Element :" + num);
    }

    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int temp = q[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return temp;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue Underflow");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.println("Elements In Queue :" + q[i]);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Queue");
        int size = sc.nextInt();
        SimpleQueue sq = new SimpleQueue(size);

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1 Insert In Queue");
            System.out.println("2 Delete From Queue");
            System.out.println("3 Display An Queue");
            System.out.println("4 For Exit");

            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Element To Push In Queue");
                    int num = sc.nextInt();
                    sq.enqueue(num);
                    break;

                case 2:
                    sq.dequeue();
                    break;
                case 3:
                    sq.display();
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