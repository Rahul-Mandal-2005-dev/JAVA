class Node {
    int data;
    Node left;
    Node right;

    public Node(int val) {
        this.data = val;
        this.right = this.left = null;
    }
}

class Graph {
    Node root;

    private Node insert(Node root, int val) {
        if (root == null)
            return new Node(val);
        else if (val < root.data)
            root.left = insert(root.left, val);
        else if (val > root.data)
            root.right = insert(root.right, val);
        else
            System.out.println("No Duplicate element");
        return root;
    }

    private void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + "--->");
        preOrder(root.left);
        preOrder(root.right);
    }

    public Node InOrderMin(Node root) {
        while (root != null && root.left != null) {
            root = root.left;
        }
        return root;
    }

    private Node delete(Node root, int val){
        if (root == null)
            return root;
        else if (val < root.data)
            root.left = delete(root.left, val);
        else if (val > root.data)
            root.right = delete(root.right, val);
        else {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            Node temp = InOrderMin(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }
        return root;
        
    }

    Graph() {
        this.root = null;
    }

    public void insert(int val) {
        this.root = insert(this.root, val);
    }

    public void preOrder() {
        preOrder(this.root);
        System.out.println("None");
    }

    public void delete(int val) {
        this.root = delete(this.root, val);
    }
}

public class Java_08Graph {
    public static void main(String[] args) {
        Graph g1 = new Graph();
        g1.insert(10);
        g1.insert(20);
        g1.insert(30);
        g1.insert(40);
        g1.insert(50);
        g1.insert(60);
        g1.insert(70);
        g1.preOrder();
        g1.delete(50);
        g1.preOrder();

    }
}
