package week2;

import java.util.Scanner;

public class recPattern {
    public static void pattern(int number){

        if(number<=0){
            System.out.print(number+ " ");
            return;
        }
        System.out.print(number+ " ");
        pattern(number-5);
        System.out.print(number + " ");

    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= input.nextInt();
        pattern(number);

    }
}
