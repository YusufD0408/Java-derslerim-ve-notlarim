package day13_MethodOlusturma;

import java.util.Scanner;

public class C04_MethodKullanma {
    public static void main(String[] args) {
        // kullancidan 10'dan kucuk iki pozitif tamsayi alip faktoryel degerlerini toplayin
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen 10'dan kucuk iki adet pozitif tamsayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2=scan.nextInt();
        int sonuc= C03_faktoryel.faktoryelHesapla(sayi1)+ C03_faktoryel.faktoryelHesapla(sayi2);
        System.out.println(sonuc);
    }
}
