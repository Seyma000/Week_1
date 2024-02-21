package week1;

import java.util.Scanner;

public class DigitNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // Define variables
        int basNumber, tempNumber;
        int result=0;

        // Enter how many digits it is
        System.out.print("Please enter number: ");
        int number = input.nextInt();

        tempNumber=number;
        while(tempNumber!=0){
            tempNumber /= 10;
        }

        // Sum of digits
        tempNumber=number;
        while(tempNumber!=0){
            basNumber = tempNumber %10;
            result+=basNumber;
            tempNumber/=10;
        }
        // Printing result
        System.out.println("Result: "+result);
    }
}
