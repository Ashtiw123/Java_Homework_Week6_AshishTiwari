package javaprogrammehomeworkweek6;

import java.util.Scanner;

public class Prog9UpperCaseToLowerCase {
    public static void main(String[] args) {
        //declared variable
        String a;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any alphabet character in Upper case");
        a=obj.next();
        System.out.println(a.toLowerCase());//method for converting upper case to lower case
        obj.close();


    }
}
