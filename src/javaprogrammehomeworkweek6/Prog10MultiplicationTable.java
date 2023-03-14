package javaprogrammehomeworkweek6;

import java.util.Scanner;

public class Prog10MultiplicationTable {

    public static void main(String[] args) {
        // declared integer
        int a;
        Scanner obj = new Scanner(System.in); //scanner
        System.out.println("Enter value to be multiplied in table: ");//instruction for user
        a = obj.nextInt();
        //formula to run time table
        for (int i = 0; i < 10; i++) {
            System.out.println(a + " X " + (i + 1) + " = " + (a * (i + 1)));
        }
        obj.close();
    }
}
