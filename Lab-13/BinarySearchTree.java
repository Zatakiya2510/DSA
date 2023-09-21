import java.util.Scanner;

/**
 * BinarySearchTree
 */
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {
    Node root;

    public BST() {
        this.root = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }
        Node cNode = root;
        while (true) {
            if (cNode.data < newNode.data) {
                if (cNode.right == null) {
                    cNode.right = newNode;
                    return;
                }
                cNode = cNode.right;
            } else if (cNode.data > newNode.data) {
                if (cNode.left == null) {
                    cNode.left = newNode;
                    return;
                }
                cNode = cNode.left;
            } else {
                System.out.println("Duplicate value can't inserted in tree.");
            }
        }

    }

    public void delete(int data) {
        Node parent = null;
        Node cNode = root;
        boolean isLeftChild = false;

        while (cNode != null && cNode.data != data) {
            parent = cNode;
            if (cNode.data > data) {
                cNode = cNode.left;
                isLeftChild = true;
            } else {
                cNode = cNode.right;
                isLeftChild = false;
            }
        }

        if (cNode == null) {
            System.out.println("Data not found so please try again.");
            return;
        }

        if (cNode.left == null && cNode.right == null) {
            if (cNode == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }

        else if (cNode.right == null) {
            if (cNode == root) {
                root = root.left;
            } else if (isLeftChild) {
                parent.left = cNode.left;
            } else {
                parent.right = cNode.left;
            }
        }

        else if (cNode.left == null) {
            if (cNode == root) {
                root = root.right;
            } else if (isLeftChild) {
                parent.left = cNode.right;
            } else {
                parent.right = cNode.right;
            }
        }

        else {
            Node successorParent = cNode;
            Node successor = cNode.right;
            while (successor.left != null) {
                successorParent = successor;
                successor = successor.left;
            }

            if (successorParent != cNode) {
                successorParent.left = successor.right;
            } else {
                successorParent.right = successor.right;
            }

            cNode.data = successor.data;
        }

    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(" [ " + root.data + " ] ");
            System.out.print(" , ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        } else {
            inorder(root.left);
            System.out.print(" [ " + root.data + " ] ");
            System.out.print(" , ");
            inorder(root.right);
        }
    }

    public void postorder(Node root) {
        if (root == null) {
            return;
        } else {
            postorder(root.left);
            postorder(root.right);
            System.out.print(" [ " + root.data + " ] ");
            System.out.print(" , ");
        }
    }

    public int minValue() {
        Node cNode = root;
        while (cNode.left != null) {
            cNode = cNode.left;
        }
        int temp = cNode.data;
        System.out.println("Minimum value is : " + temp);
        return temp;
    }

    public int maxValue() {
        Node cNode = root;
        while (cNode.right != null) {
            cNode = cNode.right;
        }
        int temp = cNode.data;
        System.out.println("Maximum value is : " + temp);
        return temp;
    }

    public void display(Node root, int level) {
        if (root != null) {
            display(root.left, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("-");
            }
            System.out.println(root.data);
            display(root.right, level + 1);
        }
    }

}

public class BinarySearchTree {
    public static void main(String[] args) {
        BST bst = new BST();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nBinary Search Tree Operations:");
            System.out.println("1. Insert a node");
            System.out.println("2. Delete a node");
            System.out.println("3. Preorder Traversal");
            System.out.println("4. Postorder Traversal");
            System.out.println("5. Inorder Traversal");
            System.out.println("6. Minimum value");
            System.out.println("7. Maximum value");
            System.out.println("8. Display Tree");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            int data;

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    data = sc.nextInt();
                    bst.insert(data);
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    data = sc.nextInt();
                    bst.delete(data);
                    break;
                case 3:
                    System.out.print("Preorder Traversal: ");
                    bst.preorder(bst.root);
                    break;
                case 4:
                    System.out.print("Postorder Traversal: ");
                    bst.postorder(bst.root);
                    break;
                case 5:
                    System.out.print("Inorder Traversal: ");
                    bst.inorder(bst.root);
                    break;
                case 6:
                    bst.minValue();
                    break;
                case 7:
                    bst.maxValue();
                    break;
                case 8:
                    System.out.println("Displaying Tree:");
                    bst.display(bst.root, 0);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}