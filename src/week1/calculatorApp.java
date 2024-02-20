package week1;

import java.util.Scanner;

public class calculatorApp {
    public static void main(String[] args) {
        int num1, num2, select;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1=input.nextInt();
        System.out.println("Enter the second number: ");
        num2=input.nextInt();

        // Select the action you want to take:
        System.out.println("1-Addition\n 2-Subtraction\n 3-Multiplication\n 4-Division");
        select =input.nextInt();

        switch (select){
            case 1:
                System.out.println("Addition: "+(num1+num2));
                break;
            case 2:
                System.out.println("Subtraction: "+(num1-num2));
                break;
            case 3:
                System.out.println("Multiplication: "+(num1*num2));
                break;
            case 4:
                //If the person chooses the divisor other than 0
                if (num2 != 0){
                    System.out.println("Division: "+(num1/num2));
                }
                else {
                    // Warning
                    System.out.println("A number cannot be divided by 0! Please enter a non-zero number ");
                }
                break;

            // If the person chooses a number other than the numbers 0-4
            default:
                System.out.println("You entered an incorrect value! Please enter a number between 0-4 ");
        }

    }
}
