package day02;

import java.util.Scanner;

public class Odev_2 {

    public static void main(String[] args) {
        /*
         * Write a Java program to compute body mass index (BMI)
         * print the situation.
         * Isuser weak, fat or obese ?
         *
         * (Hint BMI = weight(kg)/ (height*height)(m)
         * BMI<20 weak
         * 20<BMI<25 healthy
         * 25<BMI<30 fat
         * Over 30 obese
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("Your BMI is %.1f\n", bmi);

        if (bmi < 20) {
            System.out.println("You are weak");
        } else if (bmi < 25) {
            System.out.println("You are healthy");
        } else if (bmi < 30) {
            System.out.println("You are fat");
        } else {
            System.out.println("You are obese");
        }






    }
}
