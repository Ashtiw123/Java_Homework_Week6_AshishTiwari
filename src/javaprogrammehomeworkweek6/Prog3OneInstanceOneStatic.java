package javaprogrammehomeworkweek6;

//Main method
public class Prog3OneInstanceOneStatic {
    // a is a instance variable // b is a static variable
    int a = 5;
    static int b = 6;

    public static void main(String[] args) {
        Prog3OneInstanceOneStatic obj = new Prog3OneInstanceOneStatic();
        obj.method();
        obj.method1();
    }

    //Instance method
    public void method() {
        System.out.println(a);
        Prog3OneInstanceOneStatic obj1 = new Prog3OneInstanceOneStatic();
        System.out.println(obj1.b);
    }

    //Static method
    public static void method1() {
        System.out.println(b);
        Prog3OneInstanceOneStatic obj2 = new Prog3OneInstanceOneStatic();
        System.out.println(obj2.a);
    }

}
