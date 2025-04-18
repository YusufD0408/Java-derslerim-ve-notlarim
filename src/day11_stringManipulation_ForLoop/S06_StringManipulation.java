package day11_stringManipulation_ForLoop;

import java.util.Scanner;

public class S06_StringManipulation {
    public static void main(String[] args) {
        //  Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        //  :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        //  yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cumle giriniz");
        String cumle = scan.nextLine();
        if (cumle.length()%2==0){
            cumle =cumle.substring(0,cumle.length()/2)+":)"+cumle.substring(cumle.length()/2);
            System.out.println(cumle);
        }else {
            cumle =cumle.substring(0,cumle.length()/2)+":("+cumle.substring(cumle.length()/2+1);
            System.out.println(cumle);
        }
    }
}
