package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class S05_TernaryOperatoru {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println(sayi1>=sayi2 ? sayi2 : sayi1);

    }
}
