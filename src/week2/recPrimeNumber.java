package week2;

import java.util.Scanner;

public class recPrimeNumber {
    // Method to check whether it is a prime number or not
    public static String isPrime(int number, int check) {
        if (number < 2)
            return "The number is not a Prime Number";
        if (check == 1)
            return "The number is a Prime Number";
        if (number % check == 0)
            return "The number is not a Prime Number";
        return isPrime(number, check - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Print result
        System.out.println(isPrime(number, number / 2));
    }
}
