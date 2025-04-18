package day16_Scop_arrays;

import java.util.Arrays;

public class C03_ArrayElementleriniYazdirma {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,};
        System.out.println(Arrays.toString(arr));
        // Array'in tum elemenrlerini yanyana aralarinda bir bosluk olarak yazdirin
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.print(i+"");
            }else {
                System.out.print(i+",");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+" ");
        }
    }


}
