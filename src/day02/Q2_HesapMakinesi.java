package day02;

import java.util.Scanner;

public class Q2_HesapMakinesi {

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

        Scanner scan = new Scanner(System.in);

        System.out.println("Matematiksel isleme sokmak icin iki tane tamsayi giriniz : ");

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Islem turunu seciniz :\n\t1 : Toplama\n\t2 : Cikarma\n\t3 : Carpma\n\t4 : Bolme ");

        int islem = scan.nextInt();

        System.out.println("*********************IF COZUMU************************");

        if (islem == 1) System.out.println(a + b);
        else if (islem == 2) System.out.println(a - b);
        else if (islem == 3) System.out.println(a * b);
        else if (islem == 4) {
            if (b == 0) System.out.println("0'a bolum tanimsizdir!");
            else System.out.println(a / b);
        } else System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz!");

        System.out.println("*********************SWITCH CASE COZUMU************************");

        switch (islem) {

            case 1:
                System.out.println(a + " + " + b + " = " + (a + b));
                break;

            case 2:
                System.out.println(a + " - " + b + " = " + (a - b));
                break;

            case 3:
                System.out.println(a + " * " + b + " = " + (a * b));
                break;

            case 4:
                if (b == 0) System.out.println("0'a bolum tanimsizdir!");
                else System.out.println(a + " / " + b + " = " + (a / b));
                break;

            default:
                System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz!");

        }


        System.out.println("*********************SWITCH CASE 2 COZUMU************************");

        System.out.println("Islemini yapmak istediginiz issareti giriniz ");
        char isaret = scan.next().charAt(0);

        switch (isaret) {

            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;

            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;

            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;

            case '/':
                if (b == 0) System.out.println("0'a bolum tanimsizdir!");
                else System.out.println(a + " / " + b + " = " + (a / b));
                break;

            default:
                System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz!");


        }
    }
}
