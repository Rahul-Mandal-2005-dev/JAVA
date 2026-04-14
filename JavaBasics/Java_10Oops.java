// class outdise theobject
class Students{
    int student_id;
    String student_name; 
    Students(String name,int id){
        this.student_name = name;
        this.student_id = id;
    }
    public void write(){
        System.out.println(this.student_name+" "+student_id);
    }
}
public class Java_10Oops {
    public static void main(String[] args) {
        Students s1 = new Students("Rahul",2);
        s1.write();
    }
}
