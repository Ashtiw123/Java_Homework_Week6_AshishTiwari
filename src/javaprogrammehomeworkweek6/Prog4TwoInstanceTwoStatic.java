package javaprogrammehomeworkweek6;

public class Prog4TwoInstanceTwoStatic {

    int a = 4; // a is an Instance Variable
    int b = 5; // b is an Instance Variable

    // a is a static variable // b is a static variable
    static int c = 6;
    static int d = 7;

    public static void main(String[] args) {
        Prog4TwoInstanceTwoStatic obj = new Prog4TwoInstanceTwoStatic();
       obj.Method();
       obj.Method1();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(c);
        System.out.println(d);

    }
    //Instance method
    public void Method() {
        System.out.println(a);
        System.out.println(b);

    }
    //Static method
    static void Method1(){
        System.out.println(c);
        System.out.println(d);

    }


}
