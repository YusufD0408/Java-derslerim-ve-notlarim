package day07_IfStatements;

import java.util.Scanner;

public class S04_IfElsStatement {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        // olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarakter = scan.next().charAt(0);
        if (girilenKarakter>='A' && girilenKarakter<='Z'){
            System.out.println("Girilen "+girilenKarakter+" karakteri büyük harfr");
        }else {
            System.out.println("Girilen "+girilenKarakter+" karakteri büyük harf degil");
        }

    }
}
