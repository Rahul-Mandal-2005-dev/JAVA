import java.util.*;
public class Java_04Input {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        // Take Input - 
       /*
       int a = sc.nextInt();
       float b = sc.nextFloat();
       byte c = sc.nextByte();
       char d = sc.next().charAt(0);
       short e = sc.nextShort();
       Long f = sc.nextLong();
       boolean bool = sc.nextBoolean();
       String n = sc.nextLine();
       */
       
        // Check Input - ans will be always true/false using (has)
        boolean a1 = sc.hasNextInt();
        System.out.println(a1);
        // similar way check all the data types
       sc.close();
       
    }
}
