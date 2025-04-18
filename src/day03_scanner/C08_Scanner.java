package day03_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double ilkSayi = scan.nextDouble();
        System.out.println("Lütfen bir sayi giriniz");
        double ikinciSayi = scan.nextDouble();

        ilkSayi=ilkSayi+ikinciSayi;
        ikinciSayi=ilkSayi-ikinciSayi;
        ilkSayi=ilkSayi-ikinciSayi;
        System.out.println("Ilk sayinin yeni degeri = "+ilkSayi+
                "\nIkinci sayinin yeni degeri = "+ikinciSayi);

    }
}
