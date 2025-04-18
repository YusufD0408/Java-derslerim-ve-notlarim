package day11_stringManipulation_ForLoop;

import java.util.Scanner;

public class S04_StringManipulation {
    public static void main(String[] args) {
        // Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        // duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        // basariyla kaydedildi" yazdirin
        //- ilk harf kucuk harf olmali
        //- son karakter rakam olmali
        //- sifre bosluk icermemeli
        //- uzunlugu en az 10 karakter olmali
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir sifre giriniz");
        String sifre = scan.nextLine();
        int flag =0;
        if (sifre.charAt(0)>='a'&& sifre.charAt(0)<='z'){
            flag++;
        } else {
            System.out.println("ilk harf kücük harf olmali");
        }
        char harf =sifre.charAt(sifre.length()-1);
        if (harf>='0' && harf<='9'){
            flag++;
        }else {
            System.out.println("son karakter rakam olmali");
        }if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
        }else {
            flag++;
        }if (sifre.length()>=10){
            flag++;
        }else {
            System.out.println("sife uzunlugu en az 10 karakter olmali");
        }
        if (flag==4){
            System.out.println("Sifre basariyla kaydedilmistir");
        }
    }
}
