package week1;

import  java.util.Scanner;
public class flightTicketPrice {
    public static void main(String[] args) {
        // Define Variables
        int age, distance, tripType;
        double price=0;

        // Get values from user
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the distance: (in km)");
        distance= input.nextInt();
        System.out.print("Enter your age:");
        age= input.nextInt();
        System.out.print("Enter the trip type (1 => One Way, 2 => Round Trip):");
        tripType= input.nextInt();

        if (distance>0 && age>0 && (tripType==1 || tripType==2)){
            price= distance*0.10;
            double discount, tipDiscount;

            // Calculate ticket price based on conditions
            if (age<12) {
                discount= price*0.5;
                price=price-discount;
            }
            else if (age>12 && age<=24) {
                discount= price*0.1;
                price=price-discount;
            }
            else if (age>=65) {
                discount= price*0.3;
                price=price-discount;
            }

            if (tripType==2) {
                tipDiscount= price*0.2;
                price= (price-tipDiscount)*2 ;
            }
        }
        // If a value other than the expected value is entered,
        // print an error.
        else {
            System.out.println("You Entered Incorrect Data!");
        }
        // Print total price.
        System.out.println("Total Amount is "+price+"TL");
    }
}