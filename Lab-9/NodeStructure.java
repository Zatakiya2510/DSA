/**
 * NodeStructure
 */
class Node {
    int info;
    Node next;
}

public class NodeStructure {
    public static void main(String[] args) {
        Node n1 = new Node();
        Node n2 = new Node();
        n1.info = 23;
        n2.info = 20;
        n1.next = n2;
        System.out.println(n1.info);
        System.out.println(n2.info);
    }
}
