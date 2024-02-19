package week1;

import java.util.Scanner;

public class CalculateKDV {
    public static void main(String[] args) {
        double kdvRate1= 0.18, kdvRate2= 0.08;

        Scanner input= new Scanner(System.in);

        System.out.print("Enter the Price: ");
        int price= input.nextInt();


        double result= (price<1000) ? (price+(price*kdvRate1)) : (price+(price*kdvRate2));

        System.out.println("Price without KDV: "+price);
        System.out.println("Price with KDV: "+result);
        System.out.println("KDV amount: "+(price*kdvRate1));

    }
}
