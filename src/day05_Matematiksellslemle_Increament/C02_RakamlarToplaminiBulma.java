package day05_Matematiksellslemle_Increament;

import java.util.Scanner;

public class C02_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        // kullanicida dort basamakli bir sayi alip sayinin rakamlar toplamini yaydirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üc basamakli bir sayi giriniz");
        int girilenSayi = scan.nextInt();
        int rakamlarToplami =0;
        int birlerBasamagi =girilenSayi%10;  //256%10 6
        rakamlarToplami=rakamlarToplami+birlerBasamagi;

       girilenSayi=girilenSayi/10;//254
        birlerBasamagi =girilenSayi%10;
        rakamlarToplami =rakamlarToplami+birlerBasamagi;

        girilenSayi=girilenSayi/10;
        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;

        girilenSayi=girilenSayi/10;
        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;

        System.out.println("Rakamlar toplami = "+rakamlarToplami);

    }
}
