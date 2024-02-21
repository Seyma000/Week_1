package week1;

import java.util.Scanner;
public class minMaxCalculation {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int n= input.nextInt();

        System.out.print("Enter number 1: ");
        int min= input.nextInt();
        int max= min;

        for (int i=2 ; i<=n ; i++){
            System.out.print("Enter number "+i+": ");
            int number= input.nextInt();

            if (number<min){
                min= number;
            }
            else if (number>max){
                max= number;
            }
        }
        System.out.println("Smallest number is: "+min);
        System.out.println("Largest number is: "+max);
    }
}
