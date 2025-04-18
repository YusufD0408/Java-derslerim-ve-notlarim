package day19_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String> harfler =new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("K");
        System.out.println(harfler);

        System.out.println(harfler.remove("B"));
        System.out.println(harfler);

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(18);
        sayilar.add(2);

        System.out.println(sayilar);
        // Eger sadece sayilardan lusan bir list varsa remove methodu'na
        // yazacagimiz sayiyi index olarak kabul eder
        // eger sayiyi silmek istersiniz remove methodundan once o sayi
        // bir objeye atayip remove methodunda obje ismi yazabiliriz


        // 1'i silelim

        Integer silenecekSayi =1;
        sayilar.remove(silenecekSayi);
        System.out.println(sayilar);




    }
}
