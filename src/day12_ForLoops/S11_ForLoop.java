package day12_ForLoops;

import java.util.Scanner;

public class S11_ForLoop {
    public static void main(String[] args) {
        //   Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        //   kontrol edin ve sonucu yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen poziif bir tamsayi giriniz");
        int sayi = scan.nextInt();
        boolean asalMi =true;
        for (int i = 2; i <sayi ; i++) {
            if (sayi % i == 0) {
                asalMi = false;
                break;
            }

        }
        if (asalMi){
            System.out.println(sayi+" sayisi asal bir sayidir");
        }else {
            System.out.println(sayi+" sayisi asal bir sayi degildir");
        }
    }
}
