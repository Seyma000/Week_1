package week1;

import java.util.Scanner;

public class MultipleOfNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n =input.nextInt();

        for (int i=1, j=1; i<=n || j<=i; i*=4, j*=5){
            System.out.println(i);
            System.out.println(j);
        }
    }
}
