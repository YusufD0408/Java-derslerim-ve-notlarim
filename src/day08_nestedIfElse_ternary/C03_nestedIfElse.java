package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C03_nestedIfElse {
    public static void main(String[] args) {
        //  Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //  yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //  olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        double girilenYas = scan.nextDouble();
        System.out.println("Lütfen cinsiyetinizi giriniz");
        char cinsiyet = scan.next().charAt(0);
        if (girilenYas<=16 || girilenYas>80){
            System.out.println("Hatali yas girisi");
        } else if (girilenYas<60) {
            if (cinsiyet=='k'|| cinsiyet=='K'){
                System.out.println("Emekli olamak icin " + (60 - girilenYas) + " yil daha calismalisiniz");
            } else if (cinsiyet=='e'|| cinsiyet=='E') {
                System.out.println("Emekli olamak icin " + (65 - girilenYas) + " yil daha calismalisiniz");
            }else {
                System.out.println("Hatali cinsiyet girisi");
            }
        } else if (girilenYas<65) {
            if (cinsiyet=='k'|| cinsiyet=='K'){
                System.out.println("Emekli olabilirsin");
            } else if (cinsiyet=='e'|| cinsiyet=='E') {
                System.out.println("Emekli olamak icin " + (65 - girilenYas) + " yil daha calismalisiniz");
            }else {
                System.out.println("Hatali cinsiyet girisi");
            }
        }else {
            if (cinsiyet=='e'|| cinsiyet=='E'|| cinsiyet=='k'|| cinsiyet=='K'){
                System.out.println("Emekli olabilirsiniz");
            }else {
                System.out.println("Hatali cinsiyet girisi");
            }

        }
    }
}
