package day03_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen integer sayi giriniz");
       int sayi1 = scan.nextInt();
        System.out.println("Lütfen fload sayi giriniz");
        float sayi2 = scan.nextInt();
        System.out.println("Lütfen integer sayi giriniz");
        double sayi3 = scan.nextDouble();
        System.out.println("Girilen "+sayi1+" sayisi integer bir sayidir."+
                "\nGirilen "+sayi2+" sayisi fload bir sayidir"+
                "\nGirilen "+sayi2+" sayisi double bir sayidir");
    }
}
