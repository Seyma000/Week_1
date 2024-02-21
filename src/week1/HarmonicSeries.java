package week1;
import java.util.Scanner;
public class HarmonicSeries {
    public static void main(String[] args) {
        // Define variables
        double n, sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter n: "); // Request number from user
        n = input.nextDouble();

        // Calculate
        for(double i=1; i<=n;i++){ // We defined i as double, so that the result is a double value.
            sum +=1/i;
        }
        // Print Result
        System.out.print("Result: "+ sum);
    }
}
