package day25_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C02_Mutable_ImmutableClass {

    public static void main(String[] args) {

        // String ve wrapper class'lar immutABLE CLASLAR OLDUKLARI ICIN DEGISTIRILEMEZLER
        // arry ve List mutable oldugu icin atama yapmadan degerler degisir
        String str ="Java gun gectikce daha keyifli  oluyor";
        str.substring(5);
        str.substring(3,5);
        str.toLowerCase();
        System.out.println(str);
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(8);
        System.out.println(sayilar);
        sayilar.set(0,7);
        sayilar.remove(1);
        System.out.println(sayilar);
    }
}
