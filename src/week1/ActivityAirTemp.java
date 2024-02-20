package week1;

import java.util.Scanner;

public class ActivityAirTemp {
    public static void main(String[] args) {
        int heat ;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the heat : ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.print("SKI");
        } else if (heat >= 5 && heat <= 15) {
            System.out.print("CINEMA");
        } else if (heat >=15 && heat <=25 ) {
            System.out.print("PICNIC");
        } else if (heat >=25){
            System.out.print("SWIMMING");
        }
    }
}
