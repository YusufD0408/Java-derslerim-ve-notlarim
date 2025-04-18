package day19_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_getSet {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        System.out.println(sayilar);
        System.out.println(sayilar.get(0));
        //  son elementi yazdirin
        System.out.println(sayilar.get(sayilar.size() - 1));
        // 2 element 12 yapin
       sayilar.set(2, 12);
       sayilar.set(0,5);
        System.out.println(sayilar);

    }
}
