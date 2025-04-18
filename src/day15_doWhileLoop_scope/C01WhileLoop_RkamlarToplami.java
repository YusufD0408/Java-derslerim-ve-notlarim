package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C01WhileLoop_RkamlarToplami {
    public static void main(String[] args) {
        // While Loop kullanarak kullanucidan alinan sayinin rakamlar toplamini bulunuz
        Scanner scan = new Scanner(System.in);
        System.out.println("Rakamlari toplanacak pozitif tamsayi giriniz");
        int girilenSayi = scan.nextInt();
        int sayi =girilenSayi;
        int birlerBasamagi=0;
        int rakamlarToplami =0;
        while (sayi>0){
            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;
        }
        System.out.println("Girilen "+girilenSayi+" sayisinin rakamlar toplami "+rakamlarToplami);

        System.out.println(C02_RakamlarToplaminiBul.rakamlarinToplaminiBul(girilenSayi));

    }
}
