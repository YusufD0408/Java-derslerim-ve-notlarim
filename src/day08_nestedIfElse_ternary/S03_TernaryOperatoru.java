package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class S03_TernaryOperatoru {
    public static void main(String[] args) {
        //   Soru 3- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
        //   harf olarak yazdirin, yoksa girilen harfi yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char karakter = scan.next().charAt(0);
        System.out.println(karakter>='a' && karakter<='z' ? Character.toUpperCase(karakter) : karakter );
    }
}
