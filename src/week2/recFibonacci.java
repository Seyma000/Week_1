package week2;

import java.util.Scanner;

public class recFibonacci {
    static int fibonacci(int n) {
        if (n==0 || n==1){
            return 1;
        }
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter how many numbers you want to enter:");
        int number= input.nextInt();
        for (int i = 0; i<=number; i++){
            System.out.println(fibonacci(i));
        }
    }
}
