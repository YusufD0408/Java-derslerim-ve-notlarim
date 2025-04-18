package day19_arrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {
        // verlen iki katli bir array'de ayni index'e sahip elemenrleri
        // toplayip yeni olusturacaginiz tek katli bir array'e bu toplamlari atayin
        // input  int[][] arr= {{3,4,5},{2,3,6,7}};
        // output              {5,7,11}
        int[][] arr = {{3,4,5},{2,3,6,7}};
        int enKisaArrylength = arr[0].length;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i].length< enKisaArrylength){
               enKisaArrylength=arr[i].length;

            }
        }
        // toplamlari kuymak icin yeni bir array olusturalim
        int[] toplamamlarArray =new int[enKisaArrylength];
        int indexdekiElementlerToplami =0;
        for (int i = 0; i < toplamamlarArray.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                indexdekiElementlerToplami+=arr[j][i];

            }
            toplamamlarArray[i]=indexdekiElementlerToplami;
            indexdekiElementlerToplami=0;

        }
        System.out.println(Arrays.toString(toplamamlarArray
        ));
    }
}
