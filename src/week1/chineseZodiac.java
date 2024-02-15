package week1;

import  java.util.Scanner;

public class chineseZodiac {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a year (number): ");
        int year=input.nextInt();

        switch (year%12) {
            case 0: System.out.println("Your chinese zodiac is monkey "); break;
            case 1: System.out.println("Your chinese zodiac is rooster "); break;
            case 2: System.out.println("Your chinese zodiac is dog "); break;
            case 3: System.out.println("Your chinese zodiac is pig "); break;
            case 4: System.out.println("Your chinese zodiac is rat "); break;
            case 5: System.out.println("Your chinese zodiac is ox "); break;
            case 6: System.out.println("Your chinese zodiac is tiger "); break;
            case 7: System.out.println("Your chinese zodiac is rabbit "); break;
            case 8: System.out.println("Your chinese zodiac is dragon "); break;
            case 9: System.out.println("Your chinese zodiac is snake "); break;
            case 10: System.out.println("Your chinese zodiac is horse "); break;
            case 11: System.out.println("Your chinese zodiac is sheep "); break;
        }
    }
}
