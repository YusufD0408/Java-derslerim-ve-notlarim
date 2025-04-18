package day12_ForLoops;

import java.util.Scanner;

public class S07_ForLoop {
    public static void main(String[] args) {
        // Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();
        int RakamlarToplam =0;
        for (int i =sayi; i>0 ; i/=10) {
            RakamlarToplam+=i%10;
        }
        System.out.println("Rakamlar toplami : "+RakamlarToplam);
    }
}
