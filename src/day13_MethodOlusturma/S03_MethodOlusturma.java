package day13_MethodOlusturma;

import java.util.Scanner;

public class S03_MethodOlusturma {
    public static void main(String[] args) {
        //  Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
        //  olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
        //  sonuclarini donduren bir method olusturun.
      Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz");
        int girilenSayi =scan.nextInt();
        int sonuc =asalMi(girilenSayi);

        boolean sonuc1 = asalMi1(girilenSayi);
        System.out.println(sonuc1);

    }
    public static int  asalMi(int sayi){
        int flag =0;
        for (int i =2 ; i <sayi ; i++) {
            if (sayi%i==0){
                flag++;
                break;
            }
        }
        if (flag==0){
            System.out.println(sayi+" sayisi asal pozitif bir tamsayidir");
        }else {
            System.out.println(sayi+" sayisi asal pozitif bir tamsayi degildir");

        }
        return flag;
    }

    public static boolean asalMi1(int sayi){
        boolean flag =true;
        for (int i =2 ; i <sayi ; i++) {
            if (sayi%i==0){
                flag=false;
                break;
            }
        }
        if (flag){
            return true;
        }else {
           return false;

        }

    }

}
