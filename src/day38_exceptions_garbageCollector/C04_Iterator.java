package day38_exceptions_garbageCollector;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class C04_Iterator {
    public static void main(String[] args) {
        /*
        java'da Colection konusunda ögrenecegimiz gibi bazi yapilar
        index desteklemez
        bu durumda inde olmadiginda elementleri yazdirmak istersek for-each loop kullanabiliriz
         ama elementler arasinda dolasmak belirli sartlari update etmek isterseniz
         for-each loop ile yapamazsiniz
         */
        // cift sayilari silin

        // hatta listede istenmeyen elementleri silmek istedigimizde
        // her sildiginiz element uzunlugu degisecegi icin kodlar saglikli calismaz
        // bu sorunlari cözmek icin java Iterator intefacesini olusturmus


        List<Integer> sayilar =new ArrayList<>();
        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(11);

        for (int i = 0; i < sayilar.size() ; i++) {
            if (sayilar.get(i)%2==0){
                sayilar.remove(i);

            }


        }
        System.out.println(sayilar);


    }
}
