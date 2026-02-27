class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + this.name + "  Age: " + this.age);
    }
}

class Student extends Person {
    int rollNo;
    float marks;

    Student(String name, int age, int rollNo, float marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void displayStudent() {
        System.out.println("RollNo: " + rollNo + "  Marks: " + marks);
    }

    void displayStudentPerson() {
        System.out.println("Name: " + this.name + "  Age: " + this.age + "  RollNo: " + rollNo + "  Marks: " + marks);
    }
}

public class Java_06Inheritance {
    public static void main(String[] args) {
        Person p1 = new Person("Rahul", 20);
        p1.displayPerson();
        Student s1 = new Student("Ranjan", 21, 75, 99.02f);
        s1.displayStudent();
        s1.displayStudentPerson();
    }
}
