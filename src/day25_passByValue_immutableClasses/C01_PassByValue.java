package day25_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {
        List<Integer> sayilar =new ArrayList<>();
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar);
        elemenleriArtir(sayilar);
        // elemenleri artir methodunu calistirdiktan sonra
        System.out.println("elementleri artir methodundan sonra : "+sayilar);
        yeniListeAta(sayilar);
        System.out.println("Ye ni liste ata methodundan sonra : "+sayilar);
    }
    public static void elemenleriArtir(List<Integer> sayilar){
        // tum elementleri iki katina cikaralim
        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i,2*sayilar.get(i));
        }
        System.out.println("elementleri artir methodunda : "+sayilar);
    }
    public static void yeniListeAta(List<Integer> sayilar){
        // sayilar listedine yeni list degeri atayip sonra 1,2,3 elemenlerini ekleyin

        sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        System.out.println("Yeni liste ata methodunda : "+sayilar);
    }
}
