package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C02_nestetIfElse {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        // yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        // olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz");
        char cinsiyet = scan.next().charAt(0);
        System.out.println("Lütfen yasinizi giriniz");
        double girilenYas = scan.nextDouble();

        if (cinsiyet=='e'|| cinsiyet=='E'){
            if (girilenYas<16 || girilenYas>80){
                System.out.println("Hatali yas girisi");
            } else if (girilenYas>=65) {
                System.out.println("Emekli olabilirsin");
            }else {
                System.out.println("Emekli olabilmeniz icin "+(65-girilenYas)+" yil daha calismalisiniz");
            }


        } else if (cinsiyet=='k' || cinsiyet=='K') {
            if (girilenYas<16 || girilenYas>80){
                System.out.println("Hatali yas girisi");
            } else if (girilenYas>=60) {
                System.out.println("Emekli olabilirsin");
            }else {
                System.out.println("Emekli olabilmeniz icin "+(60-girilenYas)+" yil daha calismalisiniz");
            }

        }else {
            System.out.println("Hatali cinsiyet girisi, lütfen yeniden cinsiyeti giriniz");
        }
    }
}
