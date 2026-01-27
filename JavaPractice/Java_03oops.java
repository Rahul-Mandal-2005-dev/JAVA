public class Java_03oops {
    static class Node{
        int data;
        Node next;
        public Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    static class LinkedList
    {
        Node head;
        Node tail;
        public LinkedList(){
            this.head = null;
            this.tail = null;
        }
        public void insert(int val){
            Node newNode = new Node(val);
            if(head == null){
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public void display(){
            if(head==null)
                return;
            else{
                Node temp = head;
                while(temp != null){
                    System.out.print(temp.data+"--->");
                    temp = temp.next;
                }
                System.out.println("None");
            }
        }
    }
    public static void main(String args[]){
            LinkedList l1 = new LinkedList();
            l1.insert(10);
            l1.insert(20);
            l1.insert(30);
            l1.insert(40);
            l1.display();
    } 
}
