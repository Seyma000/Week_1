package week1;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a= input.nextInt();
        System.out.print("Enter the second number: ");
        int b= input.nextInt();
        System.out.print("Enter the third number: ");
        int c= input.nextInt();

        int result= a+(b*c)-b;
        System.out.println("Result is: "+result);

    }
}
