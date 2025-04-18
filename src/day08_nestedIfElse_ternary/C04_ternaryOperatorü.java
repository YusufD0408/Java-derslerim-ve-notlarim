package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C04_ternaryOperatorü {
    public static void main(String[] args) {
        // kullanicidan  pozitif bir tamsayi alin sayi cift ise cift degilse tek sayi olarak yazin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz");
        int girilenSayi = scan.nextInt();
        System.out.println(girilenSayi%2==0 ? "Cift tamsayi" : "Tek tamsayi");
    }
}
