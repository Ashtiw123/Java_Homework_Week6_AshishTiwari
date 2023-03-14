package javaprogrammehomeworkweek6;

import java.util.Scanner;

public class Prog5StringConcatenation {
    static double a, b; //static variable

    public static void main(String[] args) {
        //Scanner
        Scanner calc = new Scanner(System.in);
        System.out.println("Enter first number:"); //User guidance to enter first number
        a = calc.nextDouble();
        //User guidance to enter second number
        System.out.println("Enter second number:");
        b = calc.nextDouble();

        addition();
        subtraction();
        Prog5StringConcatenation obj = new Prog5StringConcatenation();
        obj.division();
        obj.multiplication();
    }

    public static void addition() {
        double sum = a + b;
        System.out.println("Addition of two numbers:" + sum);
    }

    public static void subtraction() {
        double sub = a - b;
        System.out.println("Subtraction of two numbers:" + sub);
    }

    public void multiplication() {
        double mult = a * b;
        System.out.println("Multiplication of two number:" + mult);
    }

    public void division() {
        double div = a / b;
        System.out.println("Division of two number:" + div);
    }

//    int a = 8;       //Instance variable
//    int b = 6;       //Instance variable
//    static int c = 4; //Static variable
//    static int d = 2; //Static variable
//
//    public static void main(String[] args) {
//        addition();
//        subtraction();
//        division();
//        multiplication();
//
//    }
//
//    public static void addition() {
//        int c = 4;
//        int d = 2;
//        int ans = c + d;
//        System.out.println("Addition of two numbers is : " + ans);
//
//        int a =8;
//        int b =6;
//        int ans1 = a + b;
//        System.out.println("Addition of two numbers is : " + ans1);
//    }
//
//    public static void subtraction() {
//        int c = 4;
//        int d = 2;
//        int ans = c - d;
//        System.out.println("Subtraction of two numbers is : " + ans);
//
//        int a =8;
//        int b =6;
//        int ans1 = a - b;
//        System.out.println("Subtraction of two numbers is : " + ans1);
//    }
//
//    public static void division() {
//        int c = 4;
//        int d = 2;
//        int ans = c / d;
//        System.out.println("Division of two numbers is : " + ans);
//        int a =8;
//        int b =6;
//        int ans1 = a / b;
//        System.out.println("Division of two numbers is : " + ans1);
//    }
//
//    public static void multiplication() {
//        int c = 4;
//        int d = 2;
//        int ans = c * d;
//        System.out.println("Multiplication of two numbers is : " + ans);
//        int a =8;
//        int b =6;
//        int ans1 = a * b;
//        System.out.println("Multiplication of two numbers is : " + ans1);
//    }
}