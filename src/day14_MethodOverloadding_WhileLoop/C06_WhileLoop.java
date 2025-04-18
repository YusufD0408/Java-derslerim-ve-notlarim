package day14_MethodOverloadding_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {


        // ancak  tekrar sayisi belli olmaya baslangic veya bitis degeri belli
        // olmayan durumlarda while loop kullanilir

        // kullanicidan toplanmak uzere sayilar alin toplam 500 asinca kac sayi girdigini
        // ve sayilarin toplamni yazdirin
        Scanner scan =new Scanner(System.in);


        int girilenSayi=0;
        int toplam=0;
        int girilenSayiAdedi=0;

        while (toplam<500){
            System.out.println("Lütfen toplanmasini istediginiz sayilari giriniz");
            girilenSayi= scan.nextInt();
            toplam+=girilenSayi;
            girilenSayiAdedi++;

        }

        System.out.println("Toplam "+girilenSayiAdedi+" adet sayi girildi ve toplami "+toplam);


    }
}
