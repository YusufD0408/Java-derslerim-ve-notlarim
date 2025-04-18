package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S06_ArrayList {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen pozitif tamsayi bolenlerini bulmak" +
                " istediginiz pozitif bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();
        System.out.println(pozitifBolenleriniListele(girilenSayi));

    }
    public static  List<Integer> pozitifBolenleriniListele(int verilenSayi){
        List<Integer> pozitifBolenlerinListesi = new ArrayList<>();
        for (int i = 1; i <=verilenSayi ; i++) {
            if (verilenSayi%i==0){
                pozitifBolenlerinListesi.add(i);
            }
        }return pozitifBolenlerinListesi;
    }
}
