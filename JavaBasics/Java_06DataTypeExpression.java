public class Java_06DataTypeExpression
{
    public static void main(String args[])
    {
        /*
        byte+short = int 
        short+int = int 
        long + float = float
        int+ float = float
        char+int = char 
        char+short = char 
        long+double = double
        float+double = double
        */
        float a = 2.394f + 73;
        System.out.println(a);

        char c = 'a'+ 2;
        System.err.println(c);
        
        char d = 'a'+ 2203;// Ans = ?
        System.err.println(d);

        int b = 2 +'a'; // a = 97 + 2 = 99
        System.err.println(b);

        //increment and decrement

        int i = 6;
        System.out.println(i);//6
        System.out.println(i++);//6
        System.out.println(i);//7

        int j = 6;
        System.out.println(j);//6
        System.out.println(++j);//7
        System.out.println(j);//7

        int y = 7;
        System.out.println(++y*8);//64

        char ch = 'a';
        System.out.println(ch++);
        System.out.println(ch);

        char cha = 'x';
        System.out.println(++cha);
        System.out.println(cha);

    }
}