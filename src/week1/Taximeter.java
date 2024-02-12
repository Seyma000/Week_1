package week1;
// Taximeter Calculation Program
import  java.util.Scanner;
public class Taximeter {
    public static void main(String[] args) {
        double distance;
        double km_amount=20;
        double opening_fee=25;

        Scanner input= new Scanner(System.in);
        System.out.print("Enter the total distance traveled: ");
        distance= input.nextDouble();

        double total_fee=(distance*km_amount)+opening_fee;
        double min_wage= 100.0;

        double result= (distance<=10? min_wage : total_fee );
        System.out.print("Total Taximeter Amount: "+ result);

    }
}
