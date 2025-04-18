package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class S02_IfeElseStatement {
    public static void main(String[] args) {
        //   Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //   hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        //   obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //   zayif yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz");
        double kg = scan.nextDouble();
        System.out.println("Lütfen boyunuzu giriniz");
        double boy = scan.nextDouble();
        double kitleEndeksi =  (kg*10000 / (boy *boy));
        if (kitleEndeksi>30){
            System.out.println("OBEZ");
        } else if (kitleEndeksi>25) {
            System.out.println("KILOLU");
        } else if (kitleEndeksi>20) {
            System.out.println("NORMAL");
        }else {
            System.out.println("ZAYIF");

        }
    }
}
