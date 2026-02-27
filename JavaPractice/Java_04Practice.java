public class Java_04Practice {
    static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head, tail;

        LinkedList() {
            head = tail = null;
        }

        void insertTail(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        void insertHead(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
            }
            newNode.next = head;
            head = newNode;
        }

        void insertPos(int val, int pos) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
            } 
            else {
                Node temp = head;
                if(pos == 1){
                    newNode.next = head;
                    head = newNode;
                }
                for(int i = 1; i<pos;i++)
                    temp = temp.next;
                Node temp1 = temp.next;
                temp.next = newNode;
                newNode.next = temp1;
            }
        }


        void display() {
            if (head == null)
                System.out.println("No elements can be printed");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "--->");
                temp = temp.next;
            }
            System.err.println("None");
        }
    }

    public static void main(String[] str) {
        LinkedList l1 = new LinkedList();
        l1.insertHead(30);
        l1.insertHead(20);
        l1.insertHead(10);
        l1.insertTail(40);
        l1.insertTail(50);
        l1.insertTail(60);
        l1.insertPos(100,2);

        l1.display();
    }
}
