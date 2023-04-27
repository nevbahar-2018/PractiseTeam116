package day02;


import java.util.Scanner;

public class Odev_3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many cups of tea do you drink in a day? ");
        int cupsPerDay = scanner.nextInt();

        System.out.print("How many sugars do you use for a glass of tea? ");
        int sugarsPerGlass = scanner.nextInt();

        int sugarsPerDay = cupsPerDay * sugarsPerGlass;
        double sugarsPerYear = sugarsPerDay * 365;
        double sugarsPer40Years = sugarsPerYear * 40;
        double kilogramsPerYear = sugarsPerYear * 2.7 / 1000;
        double kilogramsPer40Years = sugarsPer40Years * 2.7 / 1000;

        if (sugarsPerGlass == 0) {
            System.out.println("Good Job, less sugar more health!");
        } else {
            System.out.printf("You use %.2f kilograms of sugar per year.%n", kilogramsPerYear);
            System.out.printf("You would use %.2f kilograms of sugar in 40 years.%n", kilogramsPer40Years);
        }
    }
}
