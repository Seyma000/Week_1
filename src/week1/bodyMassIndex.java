package week1;

// Body Mass Index calculation
import java.util.Scanner;

public class bodyMassIndex {
    public static void main(String[] args) {

        // define variables
        double height, weight;

        Scanner input= new Scanner(System.in);
        // request values from user
        System.out.print("Please enter your height (in meters): ");
        height= input.nextDouble();
        System.out.print("Please enter your weight (in kg): ");
        weight=input.nextDouble();

        double bmi= weight/(height*height); // calculate
        System.out.print("Your Body Index: "+bmi); // print output

    }
}