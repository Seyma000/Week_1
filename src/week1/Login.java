package week1;
import  java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        // Define variables
        String userName, password, newPassword;
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        userName = input.nextLine();
        System.out.print("Enter your password: ");
        password = input.nextLine();

        if ((userName.equals("seyma000")) && (password.equals("java123"))) {
            System.out.println("Login successfully!");
        }
        else {
            System.out.println("Login failed! ");
            System.out.println("Do you want to reset your password? ");
            System.out.println("1-Yes\n2-No");
            x = input.nextInt();
            input.nextLine();

            if (x == 1) {
                System.out.print("Enter your new password: ");
                newPassword = input.nextLine();
                System.out.println(newPassword);
                if (newPassword.equals(password)) {
                    // Check previous password
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz! ");
                }
                else {
                    System.out.println("Password created!");
                }
            }
            else if (x == 2){
                System.out.println("Login Failed!");
            }
        }
    }
}

