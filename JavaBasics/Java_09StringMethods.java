public class Java_09StringMethods {
    public static void main(String args[]){
        //1.length
        String s = "Rahul";
        System.out.println(s.length());

        //2.toLowerCase
        System.out.println(s.toLowerCase());

        //3.toUpperCase
        System.out.println(s.toUpperCase());

        //4 trim
        String name = "  Rahul   Mandal   "; 
        System.out.println(name);
        System.out.println(name.trim());

        //5.substring
        String st = "Rahul";
        System.out.println(st.substring(0));
        System.out.println(st.substring(2));
        System.out.println(st.substring(0,5));
        System.out.println(st.substring(1,4));

        //6.replace
        String r = "Rahul";
        System.out.println(r.replace("Rahul","Mandal"));
        System.out.println(r.replace("R","r"));
 
        //7.startsWith and endsWith
        String n = "Rahul Mandal";
        System.err.println(n.startsWith("Rahul"));
        System.err.println(n.startsWith("rahul"));
        System.err.println(n.startsWith("Mandal"));

        //8.charAt
        String ch = "Rahul";
        System.out.println(ch.charAt(3));
        // System.out.println(ch.charAt(6)); //error - index error

        //9.indexOf
        String str = "Rahul Ranjan";
        System.out.println(str.indexOf("a"));//1
        System.out.println(str.indexOf("Rahul"));//0
        System.out.println(str.indexOf("rahul"));//-1
        System.out.println(str.indexOf("a",2));// a at 7 after index 2

        //10.
    }
}
