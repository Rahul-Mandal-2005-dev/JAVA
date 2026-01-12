public class Java_02Practice {
    public static void main(String args[]){
        // Text 
        int a = 5;
        int b = ++a + a++;
        System.out.println(b); // 12
        
        int c = 5;
        int d = ++c + ++c;
        System.err.println(d);
        
        int e = 5;
        int f = e++ + e++;
        System.err.println(f);

    }
}
