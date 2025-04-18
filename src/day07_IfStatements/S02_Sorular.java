package day07_IfStatements;

import java.util.Scanner;

public class S02_Sorular {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //  NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //  Kullanici o veya O yazdiginda output Ocak olsun.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir har giriniz");
        char girilenHarf = scan.next().charAt(0);
        if (girilenHarf=='a'|| girilenHarf=='A'){
            System.out.println("Aralik,Agustos");
        }
        if (girilenHarf=='e' || girilenHarf=='E'){
            System.out.println("Eylül,Ekim");
        }
        if (girilenHarf=='k' || girilenHarf=='K'){
            System.out.println("Kasim");
        }
        if (girilenHarf=='o' || girilenHarf=='O'){
            System.out.println("Ocak");
        }
        if (girilenHarf=='s' || girilenHarf=='S'){
            System.out.println("Subat");
        }
        if (girilenHarf=='m' || girilenHarf=='M'){
            System.out.println("Mart,Mayis");
        }
        if (girilenHarf=='n' || girilenHarf=='N'){
            System.out.println("Nisan");
        }
        if (girilenHarf=='h' || girilenHarf=='H'){
            System.out.println("Haziran");
        }



    }
}
