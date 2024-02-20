package week1;

import java.util.Scanner;

public class CircleSegmentArea {
    public static void main(String[] args) {
        final double pi= 3.14;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter radius");
        int r= input.nextInt();
        System.out.println("Enter center angle measurement");
        int a= input.nextInt();

        // Formul
        double area= (pi * (r*r) * a) / 360;

        System.out.println("Area of circle segment: "+area);

    }
}
