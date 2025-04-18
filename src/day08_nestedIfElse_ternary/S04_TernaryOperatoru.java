package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class S04_TernaryOperatoru {
    public static void main(String[] args) {
        //  Soru 4- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //  kucukse “Maalesef kaldin” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not = scan.nextDouble();
        System.out.println(not>=50 ? "Sinifi Gectin" : "Malesef kaldin");
    }
}
