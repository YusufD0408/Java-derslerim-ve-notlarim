package day36_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_KullanicininGirdigiDegerleriToplama {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar tamsayi alip toplayin
        // kullanici Q'a bastiginda islemi sonlandirip
        // kac sayi girildigini ve toplamini yazdirin
        //Q veya q disinda tamsayi olmayan bir deger girilirse
        //hata mesaji verip,yeni deger isteyerek isleme devam edin

        int sayac =0;
        int toplam =0;
        int girilenSayi =0;
        Scanner scan = new Scanner(System.in);

        do {
            try {
                System.out.println("Toplanmak üzere tam sayi giriniz ve bitirmek icin q'a basin");
                girilenSayi=scan.nextInt();
                toplam+=girilenSayi;
                sayac++;

            } catch (InputMismatchException e) {
                char input = scan.next().charAt(0);
                if (input=='q' || input=='Q'){
                    System.out.println("Girilen " +sayac+ " adet tamsayisinin toplami : "+toplam);
                    break;
                }else {
                    System.out.println("Tamsayi degeri girmelisiniz");

                }
            }
        }while (true);
        System.out.println("Bu is bukadar");
    }
}
