import java.util.*;

class Node {
    String name, classes;
    int rollNo, age;
    long contact;
    Node next;

    Node(String Name, String Class, int RollNo, int Age, long Contact) {
        this.name = Name;
        this.classes = Class;
        this.rollNo = RollNo;
        this.age = Age;
        this.contact = Contact;
        this.next = null;
    }

}

class Students {
    Node head, tail;

    Students() {
        head = tail = null;
    }

    public void add(String Name, String Class, int RollNo, int Age, long Contact) {
        Node newNode = new Node(Name, Class, RollNo, Age, Contact);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void delete(int idx) {
        if (head == null) {
            System.out.println("Student record is empty");
            return;
        }
        int i = 2;
        if (idx == 1) {
            Node temp = head;
            head = temp.next;
            temp.next = null;
            return;
        } else {
            Node temp = head;
            while (temp.next != null && idx != i) {
                temp = temp.next;
                i++;
            }
            Node delNode = temp.next;
            System.out.print("Delete Student:" + delNode.name);
            temp.next = temp.next.next;
            delNode.next = null;
            return;
        }
    }

    public Node fun(int idx) {
        Node temp = head;
        int i = 2;
        if (idx == 1)
            return temp;
        else {
            while (temp.next != null && idx != i) {
                temp = temp.next;
                i++;
            }
            return temp.next;
        }
    }

    public void update(int idx,Scanner sc) {
        Node node = fun(idx);

        System.err.println("Menu\n1.Change all info\n2.Change specific info");
        System.out.print("Choose: ");

        int choose = sc.nextInt();
        sc.nextLine();

        String n, c;
        int r, a;
        long co;
        switch (choose) {
            case 1:
                System.out.print("Name: ");
                n = sc.nextLine();
                System.out.print("Class: ");
                c = sc.nextLine();
                System.out.print("Roll No: ");
                r = sc.nextInt();
                System.out.print("Age: ");
                a = sc.nextInt();
                System.out.print("Contact: ");
                co = sc.nextLong();
                sc.nextLine();
                node.name = n;
                node.classes = c;
                node.rollNo = r;
                node.age = a;
                node.contact = co;
                System.out.println("Update complete idx " + idx);
                break;
            case 2:
                System.out.println(
                        "Menu\n1.Change Name\n2.Change Class\n3.Change RollNo\n4.Change Age\n5.Change Contact");
                System.out.print("Choose: ");
                int ch = sc.nextInt();
                sc.nextLine();
                switch (ch) {
                    case 1:
                        System.out.print("Name: ");
                        n = sc.nextLine();
                        node.name = n;
                        break;
                    case 2:
                        System.out.print("Class: ");
                        c = sc.nextLine();
                        node.classes = c;
                        break;
                    case 3:
                        System.out.print("Roll No: ");
                        r = sc.nextInt();
                        node.rollNo = r;
                        break;
                    case 4:
                        System.out.print("Age: ");
                        a = sc.nextInt();
                        node.age = a;
                        break;
                    case 5:
                        System.out.print("Contact: ");
                        co = sc.nextLong();
                        node.contact = co;
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            default:
                System.out.println("Invalid choice");
                break;
        }

    }

    public void display() {
        Node temp = head;
        int i = 1;
        while (temp != null) {
            System.err.println(i + "\tName: " + temp.name + "\tClass: " + temp.classes + "\tRoll No: " + temp.rollNo
                    + "\tAge: " + temp.age + "\tContact: " + temp.contact);
            i++;
            temp = temp.next;
        }
    }
}

public class CollegeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t|| College Management System ||");
        int choose;
        Students s1 = new Students();
        do {
            System.out.println(
                    "Menu\n1.Add the Students\n2.Delete the Students\n3.Update the Students\n4.View the Students\n5.Exit");
            System.out.print("Choose Option : ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("No of students to add: ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    String n, c;
                    int r, a;
                    long co;
                    for (int i = 0; i < num; i++) {
                        System.out.print("Name: ");
                        n = sc.nextLine();
                        System.out.print("Class: ");
                        c = sc.nextLine();
                        System.out.print("Roll No: ");
                        r = sc.nextInt();
                        System.out.print("Age: ");
                        a = sc.nextInt();
                        System.out.print("Contact: ");
                        co = sc.nextLong();
                        sc.nextLine();
                        System.out.println("Student " + (i + 1) + " Added");
                        s1.add(n, c, r, a, co);
                    }
                    break;
                case 2:
                    System.out.print("Student index: ");
                    int idx = sc.nextInt();
                    s1.delete(idx);
                    break;
                case 3:
                    System.out.print("Enter the Students idx: ");
                    int i = sc.nextInt();
                    s1.update(i,sc);
                    break;
                case 4:
                    s1.display();
                    break;
                case 5:
                    System.out.println("Exit !");
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choose != 5);
        System.out.println("<----------End---------->");
        sc.close();
    }
}