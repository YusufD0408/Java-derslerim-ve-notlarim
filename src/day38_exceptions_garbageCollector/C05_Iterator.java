package day38_exceptions_garbageCollector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C05_Iterator {
    public static void main(String[] args) {
        List<Integer> sayilar =new ArrayList<>();
        sayilar.add(61);
        sayilar.add(12);
        sayilar.add(14);
        sayilar.add(4);
        sayilar.add(72);
        // cift sayilari silin


        Iterator itr =sayilar.iterator();
        while (itr.hasNext()){

           int sayi =(Integer) itr.next();

           if (sayi%2==0){
               itr.remove();
           }

        }
        System.out.println(sayilar);


    }
}
