package day17_Arrays;

import java.util.Arrays;

public class C03_ArrayeElemanEkleme {
    public static void main(String[] args) {
        // verilen array'e istenen elementi ekleyin
        int[] a ={4,5,6};
        int[] b ={4,5,6,10};
        // arrylerin uzunlugu degistirilmez ancak array yeni bir array degeri atanabilir
        a=b;
        System.out.println(Arrays.toString(a));

        int[] arr ={4,5,6};
        int eklenecekElement =10;
        int[] yeniarr=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            yeniarr[i]=arr[i];
        }
        yeniarr[yeniarr.length-1]=eklenecekElement;
        System.out.println(Arrays.toString(yeniarr));
        arr=yeniarr;
        System.out.println(Arrays.toString(arr));
    }
}
