package day19_arrayList;

import day17_Arrays.C04_ArrayeElemanEklemeMethodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayLists {
    public static void main(String[] args) {
        /*
        ArrayList uzunlugu esnek bir listedir
        Array alt yapisini kullanir
        ancak ekleme ve silme gibi islemlerde daha avantajlidir
         */
        int[] arr ={3,4};
      arr=  C04_ArrayeElemanEklemeMethodu.elementEkleme(arr,5);
        System.out.println(Arrays.toString(arr));

        List<String> harfler =new ArrayList<>();
        harfler.add("s");
        harfler.add("l");
        harfler.add("a");
        System.out.println(harfler);
    }
}
