package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        // kullanicidan toplanmak uzere sayilar alin
        // kulllaniciya bitirmek icin 0'a basmasini soyleyin
        // kullanci sifira bastiginda
        // sifir haric kac sayi girildigini ve toplamlarini yazdirin
        Scanner scan =new Scanner(System.in);
        int girilenSayi =1; // do while bir deger yanlis bile girilirse calisir
        int toplam =0;
        int sayiAdedi=0;

        while (girilenSayi!=0){

            System.out.println("toplanmak uzere tamsayi giriniz ve bitrmek icin sifira basiniz");
            girilenSayi= scan.nextInt();
            if (girilenSayi!=0){
                toplam+=girilenSayi;
                sayiAdedi++;
            }
        }
/*
        do {
            System.out.println("toplanmak uzere tamsayi giriniz ve bitrmek icin sifira basiniz");
            girilenSayi= scan.nextInt();
            if (girilenSayi!=0){
                toplam+=girilenSayi;
                sayiAdedi++;
            }


        }while (girilenSayi!=0);

 */

        System.out.println("Girilen "+sayiAdedi+" adet sayinin toplami "+toplam);
    }
}
