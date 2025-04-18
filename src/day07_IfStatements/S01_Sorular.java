package day07_IfStatements;

import java.util.Scanner;

public class S01_Sorular {
    public static void main(String[] args) {
        //    Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //    “Sayi 5’in tam kati” yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir pozitif sayi giriniz");
        double girilenSayi =scan.nextDouble();
        if (girilenSayi%5==0){
            System.out.println("Girilen "+girilenSayi+" sayisi  5'in tam katidir.");
        }

    }
}
