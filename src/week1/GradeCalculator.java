package week1;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        int math, phy, chem, turkish, hist, music;
        Scanner input= new Scanner(System.in);

        System.out.print("Enter the Mathematics Grade: ");
        math= input.nextInt();
        System.out.print("Enter the Physics Grade: ");
        phy= input.nextInt();
        System.out.print("Enter the Chemistry Grade: ");
        chem= input.nextInt();
        System.out.print("Enter the Turkish Grade: ");
        turkish= input.nextInt();
        System.out.print("Enter the History Grade: ");
        hist= input.nextInt();
        System.out.print("Enter the Music Grade: ");
        music= input.nextInt();

        double average = (math + phy + chem + turkish + hist + music)/6;

        System.out.println("Average Grade is: "+average);
        String result=average>=60 ? "Passed" : "Failed";

        System.out.println(result);

    }
}
