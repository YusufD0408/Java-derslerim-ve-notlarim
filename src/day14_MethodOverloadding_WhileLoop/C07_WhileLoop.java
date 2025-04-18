package day14_MethodOverloadding_WhileLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan bir sifre isteyin asagidaki sarti
        // saglayana kadar her seferinde hatalari soyleyin
        // ve yeni sifre isteyi sartlari saglayan sifre olduguda
        // "5 denemenizde basarili sifre olusturuldu" seklinde yazin
        // ilk harf kucuk harf olmali
        // son harf buyuk harf olmali
        // bosluk icermemeli
        // 8 karaktr veya daha uzun olmali
        Scanner scan = new Scanner(System.in);
        String sifre ="";
        int flag =0;
        int denemeSayisi=0;

        while (flag!=4){
            flag=0;
            System.out.println("Lütfen bir sifre giriniz");
            sifre=scan.nextLine();
            if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
                flag++;
            }else {
                System.out.println("ilk karakter kucuk harf olmali");
            }
            if (sifre.charAt(sifre.length()-1)>'A'&& sifre.charAt(sifre.length()-1)<='Z' ){
                flag++;
            }else {
                System.out.println("Son karakter buyuk harf olmali");
            }
            if (sifre.contains(" ")){
                System.out.println("Sifre bosluk icermemeli");
            }else {
                flag++;
            }
            if (sifre.length()>=8){
                flag++;
            }
            else {
                System.out.println("Sifre 8 karakterden uzun olmali");
            }
              denemeSayisi++;

        }
        System.out.println(denemeSayisi+" denemenizde sifre basarili bir sekilde kaydedildi");
    }
}
