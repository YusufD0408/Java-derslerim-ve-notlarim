package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C05_ternaryOperatoru {
    public static void main(String[] args) {
        // kullanicidan bir tamsayi alip mutlak degerine cevirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int girilenSayi=scan.nextInt();
        System.out.println(girilenSayi>=0 ? (girilenSayi) : (girilenSayi*(-1)) );
    }
}
