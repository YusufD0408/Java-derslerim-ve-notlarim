package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C06_nestetTernary {
    public static void main(String[] args) {
        //  Kullanicidan bir tamsayi alin.
        //  Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani
        //  yazdirin
        //  Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
        //  uygun olani yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        double sayi = scan.nextDouble();
        System.out.println(sayi>0
                               ? sayi%2==0 ? "Cift sayi": "Cift sayi degil"
                               :sayi>-1000 && sayi<-99 ? "Uc basamakli" : "Uc basamakli degil");
    }
}
