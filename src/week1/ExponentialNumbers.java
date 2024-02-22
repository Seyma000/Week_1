package week1;

import java.util.Scanner;

public class ExponentialNumbers {
    public static void main(String[] args) {
        int sum=1;
        // Get values from user
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Enter the number to be the exponent: ");
        int exp = input.nextInt();

        // Calculate
        for (int i=1; i<=exp; i++){
            sum*=number;
        }
        // Print Result
        System.out.println(number+"^"+exp+"= "+sum);
    }
}
