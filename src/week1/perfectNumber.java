package week1;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        int sum=0;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= input.nextInt();

        for (int i=1; i<num; i++){
            if (num%i==0){
                sum+=i;
            }
        }
        if (sum==num){
            System.out.println("The number is a Prefect Number");
        }
        else {
            System.out.println("The number is not a Perfect Number");
        }

    }
}
