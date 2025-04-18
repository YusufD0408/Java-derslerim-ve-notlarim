package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin enini giriniz");
        double en = scan.nextDouble();
        System.out.println("Lütfen dikdörtgenin boyunu giriniz");
        double length = scan.nextDouble();
        double alan = en*length;
        System.out.println("Dikdörtgenin alani = "+alan);

    }
}
