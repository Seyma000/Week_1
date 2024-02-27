package week2;

import java.util.Arrays;
import java.util.Scanner;

public class nearMinMax {
    public static void main(String[] args) {
        int[] list= {56,34,1,8,101,-2,-33};
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number= input.nextInt();
        input.close();

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int insertionPoint=Arrays.binarySearch(list, number);
        System.out.println(-(insertionPoint)-1);

        System.out.println("Value "+list[(-(insertionPoint)-1)]);
    }
}
