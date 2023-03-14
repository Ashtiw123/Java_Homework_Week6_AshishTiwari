package javaprogrammehomeworkweek6;

import java.util.Scanner;

public class Prog8AreaOfTriangle {
    public static void main(String[] args) {
        double base, height; //declared variables
        int a = 2; //declared integer
        Scanner area = new Scanner(System.in); //Scanner
        System.out.println("Enter length of Base (cm): "); //instruction to user to enter length of base
        base = area.nextDouble();
        System.out.println("Enter Height of Triangle (cm): ");//instruction to user to enter height of triangle
        height = area.nextDouble();

        System.out.println("Area of Triangle (cm²): ");
        System.out.println((base*height)/a + " cm²");
        area.close();
    }


}
//{
//    public static void main(String[] args) {
//        double a, b, c, sp,area;
//        System.out.println("Enter side A value of the Triangle");
//        Scanner obj = new Scanner(System.in);
//        a = obj.nextDouble();
//        System.out.println("Enter side B value of the Triangle");
//        b = obj.nextDouble();
//        System.out.println("Enter side C value of the Triangle");
//        c = obj.nextDouble();
//
//        sp = (a + b + c) / 2;
//        area=Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));
//        System.out.println("Area of Triangle " + area);
//        obj.close();
//    }
//}
