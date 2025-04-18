package day03_scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        /*
        Kullanicdan bir double sayi,bir de int sayi alin bunlarin tplamini ve carpimini
        yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir double sayi giriniz");
        double girilenSayi1=scan.nextDouble();
        System.out.println("Lütfen integer bir sayi giriniz");
        int girilenSayi2 =scan.nextInt();
        System.out.println("Girilen sayilarin toplami = " + girilenSayi1 + girilenSayi2);
        System.out.println("Girilen sayilarin carpimi = " + girilenSayi1 * girilenSayi2);
    }
}
