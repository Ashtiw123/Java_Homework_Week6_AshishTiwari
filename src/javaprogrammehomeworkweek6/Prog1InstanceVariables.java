package javaprogrammehomeworkweek6;

public class Prog1InstanceVariables {

    // 1.1 Declare two instance variables

    int a = 10;
    int b = 10;

    //Main Method
    public static void main(String[] args) {
        Prog1InstanceVariables obj = new Prog1InstanceVariables();
        obj.Method();
    }

    //Instance Method
    public void Method() {
        System.out.println(a);
        System.out.println(b);
    }

}
