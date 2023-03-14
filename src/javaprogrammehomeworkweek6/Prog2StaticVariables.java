package javaprogrammehomeworkweek6;

public class Prog2StaticVariables {

    //a is a static variable // b is a static variable
    static int a = 5;
    static int b = 5;

    //main method
    public static void main(String[] args) {
        Prog2StaticVariables obj = new Prog2StaticVariables();
        obj.method();

    }

    //Static method
    public static void method() {
        System.out.println(a);
        System.out.println(b);

    }

}
