package kendi_aramizda;

import java.util.Scanner;

public class Soru2_StringManipulations {

    // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
    // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);


        System.out.print("Adınızı ve soyadınızı girin: ");
        String fullName = scanner.nextLine();

        // Ad ve soyadı ayırmak için split() metodunu kullanabiliriz.

        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        System.out.println("Adınız: " + firstName);
        System.out.println("Soyadınız: " + lastName);
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("iki kelimelik tek seferde ad soyad giriniz :");
        String yeni = scanner.nextLine();


        if (yeni.contains(" ")){
            System.out.println(yeni.substring(0 , yeni.indexOf(" ")));
            System.out.println(yeni.substring(yeni.indexOf(" ")+1 ,yeni.lastIndexOf("")));
        }else {
            System.out.println("lutfen iki kelimelik isim giriniz!!!");
        }

        System.out.println("Hello World");


    }
}
