package javaprogrammehomeworkweek6;

import java.util.Scanner;

public class Prog13Average {
    public static void main(String[] args) {
        int a, b, c;
        Scanner obj = new Scanner(System.in);
        System.out.println("Input three different numbers");//Instruction for user to enter three numbers
        //three variable for inputting numbers
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        //method to pull average of three different digit
        System.out.println("Average of three number  " + (a+b+c)/3);
        obj.close();



    }
}
