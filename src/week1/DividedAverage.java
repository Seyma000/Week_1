package week1;

import java.util.Scanner;

public class DividedAverage {
    public static void main(String[] args) {
        int sum=0;
        Scanner input= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int i=0;

        while (i<num){
            if (i%3==0 && i%4==0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println(""+(sum/num));
    }
}
