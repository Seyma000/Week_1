package week2;

import java.util.Scanner;

public class recPrimeNumber {
    // Method to check whether it is a prime number or not
    public static int isPrime(int number, int check) {
        // If the return 0, the number is not prime
        if (number < 2)
            return 0;
        // If the return 1, the number is prime
        if (check == 1)
            return 1;
        if (number % check == 0)
            return 0;
        return isPrime(number, check - 1);
    }

    public static void main(String[] args) {
        // Get value from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        // Print result
        System.out.println(isPrime(number, number / 2));
    }
}
