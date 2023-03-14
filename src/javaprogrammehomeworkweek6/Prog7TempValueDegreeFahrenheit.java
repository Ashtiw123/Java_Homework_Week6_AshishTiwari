package javaprogrammehomeworkweek6;

import java.util.Scanner;

public class Prog7TempValueDegreeFahrenheit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Fahrenhit Value");
        int result = scan.nextInt();

            //calculate fahrenheit to celsius
        {
            System.out.println("You have chose FAHRENHEIT to CELSIUS");//Instruction for user
        }
            double value = scan.nextDouble();
            double valueFinal = (value - 32) * 5 / 9;
            System.out.println("Celsius is: ");
            System.out.println(Math.round(valueFinal * 10.0) / 10.0);
            scan.close();


        }


    }