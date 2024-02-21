package week1;

import java.util.Scanner;

public class SumofEvenNumbers {
    public static void main(String[] args) {
        int n, total=0;
        Scanner input=new Scanner(System.in);

        do {
            System.out.println("Enter a anumber: ");
            n = input.nextInt();

            if (n%4==0){
                total+=n;
            }
        }while (n%2==0);
        System.out.print("Total: "+total);
    }
}
