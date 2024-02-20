package week1;
import java.util.Scanner;

public class invertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Getting value from user
        System.out.print("Enter the number of digits: ");
        int n = input.nextInt();

        // Triangle Drawing
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
