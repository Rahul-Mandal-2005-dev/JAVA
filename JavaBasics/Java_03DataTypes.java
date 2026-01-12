public class Java_03DataTypes {
    public static void main(String args[]){
        /*
        Data types - 
        1.Primitive - Predefine data  types
            a.byte    - 1byte (No from -128 to 127 is store)
            b.short   - 2bytes
            c.int     - 4bytes
            d.float   - 4bytes
            e.char    - 2bytes
            f.long    - 8bytes
            g.double  - 8bytes
            h.boolean - 1bit 
        */
        byte age = -128; // byte age = 128 is valid range
        int a = 20;
        short b = 9999;
        long c = 2222222222L;
        // by default the point decimal number is double
        float d = 24.55f; // F or f both 
        double e = 23.56d;// D / d both
        double f = 267.45; 
        char ch = 'A';
        boolean bool = true;

        System.out.println(age+" "+a+" "+ch+" "+b+" "+c+" "+d+" "+e+" "+f+" "+bool+" ");
        /* 
        2.Non-Primitive - Define from Primitive 
            a.String
            b.Array
            c.Class
            d.Object
            e.LinkedList
            f.Trees and Graph
        */

            String name = "Rahul Mandal";
            System.out.println(name);

            int arr[] = {1,2,3,4,5};
            for(int i = 0; i < arr.length;i++)
                System.out.print(arr[i]+"->");
    }
}
