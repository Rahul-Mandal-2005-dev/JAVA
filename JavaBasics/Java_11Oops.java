// class indise theobject

public class Java_11Oops {
    static class Students {
        String student_name;
        int student_age;

        public Students(String name,int age){
            this.student_name = name;
            this.student_age = age;
        }
    
        public void write() {
            System.out.println(this.student_name + " " + student_age);
        }
    }

    public static void main(String[] args) {
        Students s1 = new Students("Rahul", 2);
        s1.write();
    }
}
