package day17_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class S05_Arrays {
    public static void main(String[] args) {
        //  Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //          donduren bir method olusturun.
        System.out.println(Arrays.toString(arrayOlusturma()));


    }
   public static int[] arrayOlusturma() {
       Scanner scan = new Scanner(System.in);

       // Kullanıcıdan array boyutunu alalım
       System.out.print("Array boyutunu girin :");
        int boyut = scan.nextInt();

       // Kullanıcının girdiği boyuta göre integer tipinde bir array oluşturalım
           int[] yeniArr = new int[boyut];
       System.out.println("Lütfen array'in elemanlarini giriniz");
       for (int i = 0; i < boyut; i++) {
           System.out.print("Element " + (i + 1) + ": ");
           yeniArr[i] = scan.nextInt();
       }

       return yeniArr;
   }
}







