package day02;

import java.util.Scanner;

public class Q4_HesapMakinasi {
    public static void main(String[] args) {
        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabi tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen birinci tam sayi giriniz: ");
        int num1 = scanner.nextInt();
        System.out.println("Lütfen ikinci tam sayi giriniz: ");
        int num2 = scanner.nextInt();

        System.out.println("Lütfen islem türünu giriniz:  (1:toplama 2:cikarma 3:carpma 4: bolme)");
        int islem = scanner.nextInt();

        int result;

        switch (islem) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation type");
                return; // exit the program
        }

        // print the result
        System.out.println("The result is: " + result);



    }
}
