package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class S01_TernaryOperatoru {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        // “Sayi 5’in tam kati” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int girilenSayi= scan.nextInt();
        System.out.println(girilenSayi%5==0 ? "Sayi 5'in tam katidir" :"Sayi 5'in tam kati degildir" );

    }
}
