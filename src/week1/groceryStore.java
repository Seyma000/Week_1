package week1;

import java.util.Scanner;
public class groceryStore {
    public static void main(String[] args){

        // define values
        double apple,pears,tomato,eggplant, banana; //  represents how many kg the customer wants to buy.
        double appleKg=3.67 ,pearsKg=2.14 ,tomatoKg=1.11 ,eggplantKg=5.00, bananaKg=0.95 ;
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

        double total = (pears * pearsKg)+(apple * appleKg)+(tomato * tomatoKg)+(banana * bananaKg)+(eggplant *eggplantKg);

        System.out.print("total amount :  " + total);



    }
}
