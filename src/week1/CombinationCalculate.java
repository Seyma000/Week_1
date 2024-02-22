package week1;

import java.util.Scanner;

public class CombinationCalculate {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n= input.nextInt();
        System.out.println("Enter the second number: ");
        int r= input.nextInt();

        int nFactorial= 1;
        int rFactorial= 1;
        int aFactorial= 1;

        for(int i=1; i<=n; i++) {
            nFactorial *=i;
        }
        for(int j=1; j<=r; j++) {
            rFactorial *=j;
        }
        for(int k=1; k<=(n-r); k++) {
            aFactorial *=k;
        }
        // C(n,r) = n! / (r! * (n-r)!)
        // Combination Formul
        System.out.println("Combination Result: "+nFactorial/(rFactorial*aFactorial));

    }
}
