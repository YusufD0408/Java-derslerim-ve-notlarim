package day07_IfStatements;

import java.util.Scanner;

public class C02_IfElsStatement {
    public static void main(String[] args) {
        /*
        Eger bir olay icin Sadece 2 olasilik varsa ve bu olasiliklardan birisi mutlaka calisacaksa
        if else statement kullanirz

        if els statement'da if body'si mutlaka calisir ikisinin birden calisma ihtimali yoktur.
        ikisininde calismama ihtimali yoktur biri mutlaka calisir
         */
        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        // kucukse “Maalesef kaldin” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double girilenNot =scan.nextDouble();
        if (girilenNot>=50 && girilenNot<=100){
            System.out.println("Sinifi gectin");
        }
        else  {
            System.out.println("Malesef kaldin");

            System.out.println("Lütfen bir tamsayi giriniz");
            int sayi = scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen "+sayi+" sayisi cift tamsayidir");
            }else {
                System.out.println("Girilen "+sayi+"sayisi tek tamsayidir");
            }
        }
    }
}
