package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class S03_ifElseStatement {
    public static void main(String[] args) {
        //   Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //   karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //   %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //   alirsa %15, yoksa %10 indirim yapin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ürün adedini giriniz");
        int adet = scan.nextInt();
        System.out.println("Lütfen liste fiyatini giriniz");
        double fiyat = scan.nextDouble();
        System.out.println("Müsteri kartiniz varmi");
        char kart = scan.next().charAt(0);
        if (kart=='v'|| kart=='V'){
           if (adet>10){
               System.out.println("%20 indirimli top fiyat : "+(adet*fiyat*80/100));
           }else {
               System.out.println("%15 indirimli top fiyat : "+(adet*fiyat*85/100));
           }
        } else if (kart=='y' || kart=='Y') {
            if (adet>10){
                System.out.println("%15 indirimli top fiyat : "+(adet*fiyat*85/100));
            }else {
                System.out.println("%10 indirimli top fiyat : "+(adet*fiyat*90/100));
            }
        }else {
            System.out.println("Hatali giris");
        }
    }
}
