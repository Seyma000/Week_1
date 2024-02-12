package week1;

import  java.util.Scanner;
public class flightTicketPrice {
    public static void main(String[] args) {
        int age, distance, tripType;
        double price=0;

        Scanner input= new Scanner(System.in);
        System.out.print("Enter the distance: (in km)");
        distance= input.nextInt();
        System.out.print("Enter your age:");
        age= input.nextInt();
        System.out.print("Enter the trip type (1 => One Way, 2 => Round Trip):");
        tripType= input.nextInt();

        if (distance>0 && age>0 && (tripType==1 || tripType==2)){
            price= distance*0.10;

            if (age<12) {   price=price-(price*0.5);    }
            else if (age>12 && age<=24) {   price=price-(price*0.1);    }
            else if (age>=65) {   price=price-(price*0.3);    }
            else if (tripType==2) {   price=(price-(price*0.2))*2;    }
        }

        else {
            System.out.println("You Entered Incorrect Data!");
        }

        System.out.println("Total Amount is "+price+"TL");
    }
}
