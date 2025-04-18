package day12_ForLoops;

import java.util.Scanner;

public class S05_ForLoop {
    public static void main(String[] args) {
        //  Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //  hesaplayin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 20'den kücük pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();
        int faktoryel=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryel *=i;

        }
        System.out.print(sayi+"! = "+faktoryel);

    }
}
