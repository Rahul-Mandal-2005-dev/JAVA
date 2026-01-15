public class Java_08StringFormating {
    public static void main(String args[]){
        // Formate specifier - %d(int),%f(float),%c(char),%s(string)
        String s = "Rahul";
        int age = 20;
        System.err.printf("My name is %s",s); // NO space line println
        System.out.printf("age is %d\n",age);

        String str = "Mandal";
        System.out.print("string: "); // No Space 
        System.out.println(str); // Space 

        String st = "Ranjan";
        System.out.format("My name: %s",st);// same as printf
    }
}
