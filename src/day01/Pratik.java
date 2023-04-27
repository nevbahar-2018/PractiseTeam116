package day01;

import java.util.Locale;
import java.util.Scanner;

public class Pratik {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sirasiyla isminizi, soyisminizi ve yasinizi giriniz");

        char ismi = scanner.nextLine().toUpperCase().charAt(0);
        String soyIsmi= scanner.nextLine();
        int yasi = scanner.nextInt();

        System.out.println(" girilen bilgiler : "+ ismi + " "+ soyIsmi + ",  " +yasi);

    }
}
