package day16_Scop_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String[] isimler ={"Nurensan","Berke","Mustafa"};
        int[] sayilar ={1,2,3,4,5,};
        char[] karakterler ={'1','e','f'};
        // Array non primitive data turlerindendir
        // Eger array liste seklinde olusturmayip new keyword kullaniyorsak
        // uzunlugunu yazmak zorundayiz.
        String[] arr =new String[5];


        // bir array tanimlanan uzunlukta daha fazla yada daha az eleman almaz
        // bir array yazdirmak istersek
        System.out.println(isimler);// arryler direk yazdirilamaz
        System.out.println(Arrays.toString(isimler));
        System.out.println(Arrays.toString(arr));
        int[] a=new int[7];
        System.out.println(Arrays.toString(a));
        // arraydeki elementlere nasil ulasiriz ? index ile
        a[0]=4;
        System.out.println(Arrays.toString(a));
        a[3]=7;
        System.out.println(Arrays.toString(a));
        //a[7]=8;
         // System.out.println(Arrays.toString(a)); // array uzunlugundan fazla eleman alamaz
        // sayilar array'inin 4. index'indeki elementi yazdirin
        System.out.println(sayilar[4]);
        System.out.println(isimler[1]);
    }
}
