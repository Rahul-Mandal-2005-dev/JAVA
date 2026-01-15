import java.util.*;
public class Java_07String {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String are in-mutable
        String s = new String("Rahul Mandal");
        System.err.println(s);
                //or
        String st = "Rahul Mandal";
        System.out.println(st);

        // String Input - Dont use next and nextLine at once
        // String name1 = sc.next();// string without space
        // System.out.println("Name1 : "+name1);
        String name2 = sc.nextLine();// string with space
        System.out.println("Name2: "+name2);
        sc.close();
    }
}
