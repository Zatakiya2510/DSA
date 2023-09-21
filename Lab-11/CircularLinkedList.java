import java.util.Scanner;

/**
 * CircularLinkedList
 */

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class CLL{
    Node head;
    Node tail;

    public CLL{
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(Node newNode){
        if(head == null){
            head = newNode;
            last = newNode;
            head.next = head;
            return;
        }
        else{
            newNode.next = head;
            tail.next = head;
            head = newNode;
            return;
        }
    }
    public void insertLast(Node newNode){
        if(head == null){
            head = newNode;
            last = newNode;
            head.next = head;
            return;
        }
        else{
            newNode.next = head;
            tail.next = head;
            last = newNode;
            return;
        }
    }
    public void display(){
        if(head == null){
            System.out.println("Circular Linked List Empty");
            return;
        }
        else{
            Node current = head;
            do {
                System.out.println("["+current.data+"]");
                current = current.next;
            } while (current != tail);
        }
    }
    public void deleteFirst(){
        if(head == tail){
            first = null;
            last = null;
        }
        else{
            first = first.next;
            last.next = first;
        }
    }
    public void deleteLast(){
        if (head == tail) {
            first = null;
            last = null;
        } else {
            while (current.next!=last) {
                current = current.next;
            }
            currrent.next = first;
            last = current;
        }
    }

}

public class CircularLinkedList {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        CLL cll = new CLL();

        while(true){
            System.out.println("Menu");
            System.out.pritnln("1. Insert at first of list");
            System.out.println("2. Insert at last of list");
            System.out.println("3. Display list");
            System.out.println("4. Delete first element of list");
            System.out.println("5. Delete last element of list");
            System.out.pritnln("6. Exit a program");

            int choice = sc.nextInt();
            int data;
            Node newNode;
            switch (Choice) {
                case 1:
                    System.out.println("Enter a number to insert at first in list.");
                    data = sc.nextInt();
                    newNode = new Node(data);
                    cll.insertFirst(newNode);
                    break;
                case 2:
                    System.out.println("Enter a number to insert at last in list.")
                    data = sc.nextInt();
                    newNode = new Node(data);
                    cll.insertLast(newNode);
                    break;
                case 3:
                    cll.display();
                    break;
                case 4:
                    cll.deleteFirst();
                    break;
                case 5:
                    cll.deleteLast();
                    break;
                case 6:
                    System.out.println("Exiting a program");
                    sc.close();
                    System.exit();
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
        }
    }
}