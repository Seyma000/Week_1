package week2;

import java.util.Arrays;
import java.util.Scanner;

public class arraySorting {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter array's length: ");
        int n= input.nextInt();
        int[] array=new int[n];

        System.out.println("Enter array's elements: ");
        for (int i=0; i < array.length; i++){
            System.out.print(i+". element: ");
            int elements=input.nextInt();
            array[i]=elements;
        }
        Arrays.sort(array);
        System.out.print(Arrays.toString(array));
    }
}
