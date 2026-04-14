class A{
    public A(){
        System.out.println("A is running");
    }
}
class B extends A{
    public B(){
        System.out.println("B is running");
    }

}
public class Java_12Inharitance {
    public static void main(String []str)
    {
        B var = new B();
    }
}
