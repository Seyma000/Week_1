package week1;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Get values from user and define
        System.out.println("Enter a int number: ");
        int intNumber= input.nextInt();
        System.out.println("Enter a double number: ");
        double doubleNumber= input.nextDouble();

        // Type Casting Process and Print
        double intToDouble = (double) intNumber;
        System.out.println("int to double  Casting :"+intToDouble);

        int doubleToInt = (int) doubleNumber;
        System.out.println("double to int  Casting :"+doubleToInt);

    }
}
