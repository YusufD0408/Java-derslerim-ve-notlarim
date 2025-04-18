package day19_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_add {
    public static void main(String[] args) {
        // List data turu olarak primitive data turu kabul etmez
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        System.out.println(sayilar);
        // uc ile bes arasina element olarak  yediyi ekleyelim
        sayilar.add(1,7);
        System.out.println(sayilar);

        List<Integer> ekler =new ArrayList<>();
        ekler.add(4);
        ekler.add(6);
        System.out.println(ekler);
        sayilar.addAll(ekler);
        System.out.println(sayilar);
        // 7 ile 5 arasina ekleri ekleyin
        sayilar.addAll(2,ekler);
        System.out.println(sayilar);

    }
}
