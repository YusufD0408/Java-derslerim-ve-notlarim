package day13_MethodOlusturma;

import java.util.Scanner;

public class C06_MethodKullanma {
    public static void main(String[] args) {
        // verilen br stringin palidrom olup olmadigini yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scan.nextLine();
        String tersMetin=C05_StringiTerseCevirme.stringiTersineCevir(metin);
        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin PALINDROME");
        }else {
            System.out.println("Girilen metin PALIDROME degil");
        }
    }
}
