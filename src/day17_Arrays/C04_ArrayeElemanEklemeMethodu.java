package day17_Arrays;

import java.util.Arrays;

public class C04_ArrayeElemanEklemeMethodu {
    public static void main(String[] args) {
        // verilen bir arraye istenen bir elementi ekleyip yeni halini
        // bize donduren bir method olusturun
        int[] arr ={2,3,4,5,6};
       arr= elementEkleme(arr,9);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] elementEkleme(int[] arr,int eklenecekElement){
        int[] yeniarr =new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
           yeniarr[i]=arr[i];
        }
        yeniarr[yeniarr.length-1]=eklenecekElement;

        return yeniarr;
    }
}
