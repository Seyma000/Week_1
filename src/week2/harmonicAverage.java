package week2;

public class harmonicAverage {
    public static void main(String[] args) {
        // Define values
        int[] array = {1, 3, 5, 7, 9};
        int sum = 0;
        // Calculates harmonic series
        for (int v : array) sum += 1 / array[v];
        // Print Result
        System.out.println(sum / array.length);
    }

}
