package day07_IfStatements;

import java.util.Scanner;

public class S05_IfElsStatement {
    public static void main(String[] args) {
        //   Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //   olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);
        if (girilenKarakter>='A' && girilenKarakter<='Z'){
            System.out.println(girilenKarakter);
        }else {
            System.out.println(Character.toUpperCase(girilenKarakter));
        }
    }
}
