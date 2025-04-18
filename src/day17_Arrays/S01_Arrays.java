package day17_Arrays;

import java.util.Arrays;

public class S01_Arrays {
    public static void main(String[] args) {
        //    Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //    olusturun. Eski array’i yeni haliyle kaydedin.
        int[] arr ={3,4,5};
       arr= elemanArttirma(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] elemanArttirma(int[] ilkarr,int artis){
        for (int i = 0; i <ilkarr.length ; i++) {
            ilkarr[i]+=artis;

        }
        return ilkarr;
    }
}
