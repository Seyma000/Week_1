package week1;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // Get numbers from user
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Finding and Print EKOK
        int i=1;
        while (i<=(num1*num2)){
            if (i%num1==0 && i%num2==0){
                System.out.println("EKOK: "+i);
                break;
            }
            i++;
        }

        // Finding and Print EBOB
        int k=num1;
        while (k>=1){
            if (num1%k==0 && num2%k==0){
                System.out.println("EBOB: "+k);
                break;
            }
            k--;
        }

    }
}
