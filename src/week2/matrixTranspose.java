package week2;

public class matrixTranspose {
    public static void main(String[] args) {
        int[][] array = {
                {2, 3, 4},
                {5, 6, 4}
        };

        System.out.println("Matrix is: ");
        for (int i = 0; i <array.length; i++)
        {
            for (int j = 0; j<array[i].length;  j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println( " ");
        }

        System.out.println("Transpoze is: ");
        for (int i = 0; i < array[0].length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                System.out.print(array[j][i] + " ");
            }
            System.out.println("");
        }
    }
}
