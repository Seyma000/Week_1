package week2;

public class recPalindrom {
    // Method to check if it is a palindrome number
    static boolean isPalindrom(int number) {
        // Define values
        int temp = number, reverseNumber = 0, lastNumber;

        // Find the reverse of the number with loop
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        // Check if number and its reverse are the same
        if (number == reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        // Call Method
        System.out.println(isPalindrom(1234));

    }
}
