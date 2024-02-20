package week1;

import java.util.Scanner;

public class PassingClass {
    public static void main(String[] args) {
        double math, music, history, physic, chemic, result;
        int divisor = 0 ;

        Scanner input= new Scanner(System.in);
        System.out.print("Enter the math grade: ");
        math = input.nextFloat();
        if (math>=0 && math<=100){
            divisor += 1;
        }
        else { // Checking if an invalid grade was entered
            math=0; // When an invalid grade is entered, disable the grade
            System.out.println("Invalid grade !");
        }

        System.out.print("Enter the music grade: ");
        music = input.nextFloat();
        if (music>=0 && music<=100){
            divisor += 1;
        }
        else {
            music=0;
            System.out.println("Invalid grade!");
        }

        System.out.print("Enter the history grade: ");
        history = input.nextFloat();
        if (history>=0 && history<=100){
            divisor += 1;
        }
        else {
            history=0;
            System.out.println("Invalid grade!");
        }

        System.out.print("Enter the physic grade: ");
        physic = input.nextFloat();
        if (physic>=0 && physic<=100){
            divisor += 1;
        }
        else {
            physic=0;
            System.out.println("Invalid grade!");
        }

        System.out.print("Enter the chemic grade: ");
        chemic = input.nextFloat();
        if (chemic>=0 && chemic<=100){
            divisor += 1;
        }
        else {
            chemic=0;
            System.out.println("Invalid grade !");
        }

        //GPA calculation
        result = (math+music+history+physic+chemic) / divisor;
        if (result >= 55){
            System.out.println("Average : "+ result);
            System.out.print("You Passed the Class!");
        }
        else{
            System.out.println("Average : "+ result);
            System.out.print("You Failed the Class");
        }


    }
}
