package day13_MethodOlusturma;

import java.util.Scanner;

public class S01_MethodOlusturma {
    public static void main(String[] args) {
       /* //   Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        //   baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        //   bir method olusturun.
        //- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        //   mesaji verin
        //- kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        //  yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cumle giriniz");
        String metin = scan.nextLine();
        System.out.println("Lütfen baslangic indeksi giriniz");
        int baslangicIndex =scan.nextInt();
        System.out.println("Lütfen bitis indeksi girniz");
        int bitisIndex = scan.nextInt();
        if (baslangicIndex>bitisIndex){
            System.out.println("baslagic indeksi bitis indeksinden buyuk olamaz");
        } else if (baslangicIndex>metin.length() && bitisIndex>metin.length()) {
            System.out.println("baslangic ve bitis degeri cumle indeksinden buyuk olamaz");
        }else {
            for (int i = baslangicIndex; i <bitisIndex ; i++) {
                System.out.println(metin.charAt(i));

            }

        }

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cumle giriniz");
        String metin = scan.nextLine();
        System.out.println("Lütfen baslangic indeksi giriniz");
        int baslangicIndex =scan.nextInt();
        System.out.println("Lütfen bitis indeksi girniz");
        int bitisIndex = scan.nextInt();

        harfleriYazdir(metin,baslangicIndex,bitisIndex);


        harfleriYazdir("java guzeldir",2,7);
         String str = "yavas kardas ucucan";
         harfleriYazdir(str,3,6);
    }
    public static void harfleriYazdir(String cumle,int baslangicIndex,int bitisIndex){

        if (baslangicIndex>bitisIndex){
            System.out.println("baslagic indeksi bitis indeksinden buyuk olamaz");
        } else if (baslangicIndex>cumle.length() && bitisIndex>cumle.length()) {
            System.out.println("baslangic ve bitis degeri cumle indeksinden buyuk olamaz");
        }else {
            System.out.println(cumle.substring(baslangicIndex,bitisIndex));

        }
        System.out.println("");
    }
}
