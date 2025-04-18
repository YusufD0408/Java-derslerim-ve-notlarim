package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("Lütfen ikinci sayiyi giriniz");
        double sayi2 = scan.nextDouble();
        double temp =0;
        temp =sayi1;
       sayi1=sayi2;
       sayi2=temp;
        System.out.println("Ilk sayinin yeni degeri = "+sayi1+
                "\n Ikinci sayinin yeni deger = "+sayi2);
    }
}
