// package JavaPractice;
import java.util.*;
public class Java_01Practice {
    static float percentage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("marks " + (i + 1)+":");
            int marks = sc.nextInt();
            sum += marks;
        }
        sc.close();
        return ((sum / 500f) * 100);
    }
    
    public static void main(String args[]) {
        float marks = percentage();
        System.err.println(marks+"%");
    }
}
