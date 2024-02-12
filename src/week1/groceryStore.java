package week1;

import java.util.Scanner;
public class groceryStore {
    public static void main(String[] args){

        // dedfine values
        double apple,pears,tomato,eggplant, banana; //  represents how many kg the customer wants to buy.
        Scanner input = new Scanner(System.in);

        // take values from the user
        System.out.print("How many kilos of pears: ");
        pears = input.nextDouble();
        System.out.print("How many kilos of apple: ");
        apple = input.nextDouble();
        System.out.print("How many kilos of tomato: ");
        tomato = input.nextDouble();
        System.out.print("How many kilos of banana: ");
        banana = input.nextDouble();
        System.out.print("How many kilos of eggplant: ");
        eggplant = input.nextDouble();

        double total = (pears * 2.14)+(apple * 3.67)+(tomato * 1.11)+(banana * 0.95)+(eggplant *5.00);

        System.out.print("total amount :  " + total);



    }
}
