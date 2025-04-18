package day14_MethodOverloadding_WhileLoop;

import java.util.Scanner;

public class S02_WhileLoop {
    public static void main(String[] args) {
        // Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen rakamlari toplanacak pozitif bir tamsayi giriniz");
        int girilensayi=scan.nextInt();
        int sayi=girilensayi;
        int birlerbasamagi =0;
        int rakamlarToplam =0;

        while (sayi!=0){ //  yada sayi>0
            birlerbasamagi=sayi%10;
            rakamlarToplam+=birlerbasamagi;
            sayi/=10;
        }
        System.out.println(girilensayi+" sayisinin rakamlar toplami "+rakamlarToplam);


    }
}
