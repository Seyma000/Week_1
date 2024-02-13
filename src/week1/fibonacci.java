package week1;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a=0,b=1,c;
        Scanner input=new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int x=input.nextInt();
        System.out.print(a+" "+b);

        for (int i=2; i<x; i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
        System.out.println();
    }
}
