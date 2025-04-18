package day13_MethodOlusturma;

import java.util.Scanner;

public class S02_MethodOlusturma {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
        // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        // isim bosluk soyisim seklinde bize donduren bir method olusturun
        // input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim = scan.nextLine();
        System.out.println(isimSoysim(isim, soyisim)); // yazdirmazsak method calisir ama yazdirmaz
        String isimduzenleleMothdu =isimSoysim(isim,soyisim);

    }
    public static String isimSoysim(String isim,String soyisim){
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
        String istenenFotmattaIsimSoyisim =isim+" "+soyisim;
        return istenenFotmattaIsimSoyisim;
    }

}
