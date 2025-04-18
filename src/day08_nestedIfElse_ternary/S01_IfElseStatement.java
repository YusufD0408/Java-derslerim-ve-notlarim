package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class S01_IfElseStatement {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        // oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        // yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi girniz");
        int girilenSayi = scan.nextInt();
        if (girilenSayi==0 ){
            System.out.println(girilenSayi+" sayisi cift bir tamasayidir");
        } else if (girilenSayi%2!=0 ) {
            if (girilenSayi>0){
                System.out.println(girilenSayi+" sayisi pozitif bir tek tamsayidir");
            }else {
                System.out.println(girilenSayi+" sayisi negatif bir tek tamsayidir");
            }
        }else {
            if (girilenSayi%2==0){
                if (girilenSayi%10==0){
                    System.out.println(girilenSayi+" sayisi 10'un tam katidir");
                }else {
                    System.out.println(girilenSayi+" sayisi 10'un tam kati degeldir");
                }
            }
        }
    }
}
