package week1;

import java.util.Scanner;

public class FindingHypotenuse {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner input= new Scanner(System.in);

        System.out.println("The length of the first perpendicular side of the triangle: ");
        a= input.nextInt();
        System.out.println("Length of the second perpendicular side of the triangle: ");
        b= input.nextInt();

        // Hypotenuse Calculation Formula
        c= Math.sqrt(a*a + b*b);

        System.out.println("Hypotenuse Length is: " +c);


    }
}
