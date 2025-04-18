package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class S04_ifElseStatement {
    public static void main(String[] args) {
        //  Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        //  sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        //  “istediginiz birim sisteme kayitli degil” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen mesafeyi kilometre olarak giriniz");
        double kg = scan.nextDouble();
        System.out.println("cevirmek istediginiz birimi giriniz");
        char birim = scan.next().charAt(0);
        if (birim=='m' || birim=='M'){
            System.out.println("Km olarak girdiginiz mesafe "+(kg*1000)+" Metredir");
        } else if (birim=='s' || birim=='S') {
            System.out.println("Km olarak girdiginiz mesafe "+(kg*1000)+" Santimetredir");
        }else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }
    }
}
