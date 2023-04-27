package kendi_aramizda;

import java.util.Scanner;

public class Soru1_StringManipulations {

    // Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle yaziniz");
        String cumle= scan.nextLine();

        System.out.println(cumle.contains(" "));

        /*
        Scanner scanner = new Scanner(System.in);


        System.out.print("Bir string girin: ");
        String girilenString = scanner.nextLine();

        //boolean space = girilenString.contains(" ");

        //if (girilenString.contains(" ")) {
        //    System.out.println("Girdiğiniz string boşluk karakteri içeriyor.");
        //} else {
         //   System.out.println("Girdiğiniz string boşluk karakteri içermiyor.");
        //}

        //contains() metodu kullanarak girilen stringin içinde boşluk karakterinin olup olmadığını kontrol ederiz.
        // Eğer boşluk karakteri içeriyorsa space değişkeni true değerini alır,
        // aksi takdirde false değerini alır. Son olarak, if-else yapısı kullanarak sonucu ekrana yazdırırız.
 */
    }
}
