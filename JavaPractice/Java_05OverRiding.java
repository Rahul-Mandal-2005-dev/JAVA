class OverRiding {
    OverRiding(String name) {
        System.out.println("Hello " + name);
    }

    float add(int a, int b) {
        return a + b;
    }
    float add(int a, int b,int c)
    {
        return a+b+c;
    }
}

public class Java_05OverRiding {
    public static void main(String[] str) {
        OverRiding o1 = new OverRiding("Rahul");
        System.out.println(o1.add(2,2));
        System.out.println(o1.add(2,2,4));
    }
}
