package day13_MethodOlusturma;

import java.util.Scanner;

public class C02_ikiSayiyiToplama {
    public static void main(String[] args) {
        // kullanicidan iki sayi alip toplamlarini yazdiran bir method olusturun
        ikiSayiyitopla();
    }
    public static void  ikiSayiyitopla(){
        Scanner scan =new Scanner(System.in);
        System.out.println("toplamak uzere iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("iki sayinin toplami = "+(sayi1+sayi2));

    }
}
