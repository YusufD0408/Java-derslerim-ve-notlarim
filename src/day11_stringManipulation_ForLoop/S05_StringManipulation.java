package day11_stringManipulation_ForLoop;

import java.util.Scanner;

public class S05_StringManipulation {
    public static void main(String[] args) {
        //  Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        //- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        //  yazdirin
        //- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        //  harflerle yazdirin.
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim = scan.nextLine();
        if (isim.length()>soyisim.length()){
            System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "+
                    soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase());
        }else {
            System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "+
                    soyisim.toUpperCase());
        }

    }
}
