package day12_ForLoops;

import java.util.Scanner;

public class S10_ForLoop {
    public static void main(String[] args) {
                // Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip
                   //kaydedin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir string giriniz");
        String string= scan.nextLine();
        String tersMetin="";
        for (int i = string.length()-1; i >=0 ; i--) {
            tersMetin +=string.charAt(i);

        }
        String yeniMetin =tersMetin;
        System.out.println(yeniMetin);
    }
}
