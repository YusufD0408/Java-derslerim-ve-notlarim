package day03_scanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int girilenSayi =scan.nextInt();
        int girlenSayininKaresi =girilenSayi*girilenSayi;
        System.out.println("Girilen sayinin karesi = "+girlenSayininKaresi);
    }
}
