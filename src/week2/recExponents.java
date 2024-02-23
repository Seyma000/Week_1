package week2;

import java.util.Scanner;

public class recExponents {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number= input.nextInt();
        System.out.print("Enter the power: ");
        int power= input.nextInt();

        System.out.print("Result is: ");
        System.out.print(exponentiation(number, power));

    }
    public static int exponentiation (int number, int power){
        if (power==0)
            return 1;
        else {
            return number*exponentiation(number, power-1);
        }

    }
}
