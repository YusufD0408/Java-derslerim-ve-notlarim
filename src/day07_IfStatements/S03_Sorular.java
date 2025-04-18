package day07_IfStatements;

import java.util.Scanner;

public class S03_Sorular {
    public static void main(String[] args) {
        //    Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //    sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int girilenSayi = scan.nextInt();

        if (girilenSayi%15==0){
            System.out.println("Girilen sayi hem Uc hem de Bes ile bolünebilir ");

        }
        if (girilenSayi%3==0){
            System.out.println("Girilen sayi Uc ile bolünebilir ");
        }
        if (girilenSayi%5==0){
            System.out.println("Girilen sayi Bes ile bolünebilir ");
        }

    }
}
