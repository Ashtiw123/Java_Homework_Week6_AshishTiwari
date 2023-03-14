package javaprogrammehomeworkweek6;

import java.util.Scanner;

public class Prog6RadiusValueOfCircle {
    public static void main(String[] args) {
        double radius, area; //declared variable
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle in cm");
        radius = input.nextDouble();
        input.close();
        //method for Area of circle
        area = Math.PI * radius * radius;
        System.out.println("Area of the Circle is " + area + " cm");
    }
}
