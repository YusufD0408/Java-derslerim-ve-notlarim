package day14_MethodOverloadding_WhileLoop;

import java.util.Scanner;

public class S04_WhileLoop {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
        // istediginde 0'a basmasini soyleyin
        // Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
        // bunlarin toplaminin kac oldugunu yazdirin
        // Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        // negatif sayiyi sayi adedine ve toplama eklemeyin

        Scanner scan = new Scanner(System.in);
        int girilensayi=1;
        int toplam=0;
        int sayiaAdedi =0;
        while (girilensayi!=0){
            System.out.println("Lütfen toplamak istedidiginiz sayilari girinizve bitirmek icin sifira basiniz");
            girilensayi= scan.nextInt();
            if (girilensayi>0) {
                toplam += girilensayi;
                sayiaAdedi++;
            }else {
                System.out.println("Lütfen pozitif bir tamsayi giriniz");
            }
        }

        System.out.println(sayiaAdedi+" adet sayinin toplami "+toplam);
    }
}
