package day21_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayiListeCevirme {
    public static void main(String[] args) {
        Integer[] arr ={3,5,6,7,3,2,3,5,8,7,1,2,3,4,5};
        // arr array'in elementlerini iceren bir arraylist olusturun
        List<Integer> sayilar =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println("Sayilar liste : "+sayilar);
        /*
        Javada bir array'i arrayliste cevirmek icin kullanilan aslist() vardir
        ancak kullami tavsiye edilmez. cunku iki tana buyuk dezavantaji vardir
         */
        List<Integer> arraydenList = Arrays.asList(arr);
        System.out.println("array'den liste cevrilen : "+arraydenList);

        // 1. dezavantaj aslist kullanilarak array'den cevrilen listelerde ekleme/ silme uzunlugu degistiren
        // methotlar kullanilamaz
        sayilar.add(11);
        // arraydenList.add(11);
        System.out.println(sayilar);

        // iki list'in 0. index'indek elementleri silelim
        sayilar.remove(0);
         // arraydenList.remove(0);

        // 2. dezavantaj arka planda array'den donusturdugumuz list beraber hareket
        // eder birinde yaptigimiz update'ler otekinede islenir

        System.out.println("Array          : "+Arrays.toString(arr));
        System.out.println("Array'den list : "+arraydenList);
        arr[0]=22;
        System.out.println("**********array'i degistirdikten sonra**********");

        System.out.println("Array          : "+Arrays.toString(arr));
        System.out.println("Array'den list : "+arraydenList);
        // listin bir elementini update edelim
        arraydenList.set(1,45);
        System.out.println("**********array'i degistirdikten sonra**********");
        System.out.println("Array          : "+Arrays.toString(arr));
        System.out.println("Array'den list : "+arraydenList);


    }
}
