package javaprogrammehomeworkweek6;

import java.util.Scanner;

public class Prog17DecimalToBinary {

    public static void main(String[] args) {

        int a;//declared integer

        //Create an object of the Scanner class
        Scanner obj = new Scanner(System.in);//scanner

        System.out.println("Enter a decimal number: ");//Instruction for user to enter decimal number

        //Enter a decimal number
        a = obj.nextInt();

        //Print Binary Number
        System.out.println("Binary number is: " + Integer.toBinaryString(a));
    }
}
