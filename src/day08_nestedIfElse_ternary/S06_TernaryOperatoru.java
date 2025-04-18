package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class S06_TernaryOperatoru {
    public static void main(String[] args) {
        // Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int girilenSayi=scan.nextInt();
        System.out.println(girilenSayi>=0 ? (girilenSayi) : (girilenSayi*(-1)) );


    }
}
