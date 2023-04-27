package day02;

import java.util.Scanner;

public class Odev_1 {

    public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);
                String password;

                while (true) {
                    System.out.println("Please enter a password that contains at least one uppercase letter, one lowercase letter, one digit, one special character, and is at least 8 characters long:");
                    password = scanner.nextLine();

                    if (password.length() < 8) {
                        System.out.println("Password must be at least 8 characters long.");
                        continue;
                    }

                    if (!password.matches(".*[A-Z].*")) {
                        System.out.println("Password must contain at least one uppercase letter.");
                        continue;
                    }

                    if (!password.matches(".*[a-z].*")) {
                        System.out.println("Password must contain at least one lowercase letter.");
                        continue;
                    }

                    if (!password.matches(".*\\d.*")) {
                        System.out.println("Password must contain at least one digit.");
                        continue;
                    }

                    if (!password.matches(".*[^\\w\\d\\s].*")) {
                        System.out.println("Password must contain at least one special character.");
                        continue;
                    }

                    System.out.println("Password is valid!");
                    break;
                }






    }
}
