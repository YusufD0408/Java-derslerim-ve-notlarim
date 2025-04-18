package day13_MethodOlusturma;

import java.util.Scanner;

public class S05_WhileLoop {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
        // kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
        // olusturun.
        usHesaplama(3,4);
    }
    public static void usHesaplama(double sayi,int ust){
        int sayilarinCarpimi =1;
        while (ust>0){
            sayilarinCarpimi*=sayi;
            ust--;
        }
        System.out.println("sonuc : "+sayilarinCarpimi);
    }
}
