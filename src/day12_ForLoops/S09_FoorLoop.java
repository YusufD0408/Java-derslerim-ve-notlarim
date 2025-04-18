package day12_ForLoops;

import java.util.Scanner;

public class S09_FoorLoop {
    public static void main(String[] args) {
        // Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scan.nextLine();
        String tersMetin ="";
        for (int i =metin.length()-1; i>=0 ; i--) {
            tersMetin+=metin.charAt(i);
        }
        System.out.println(tersMetin);
    }
}
