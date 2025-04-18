package day18_multiDimensionalArrays;

import java.util.Arrays;

public class S02_MDA {
    public static void main(String[] args) {
        //   Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
        //           olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //           input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        //           output: [5, 7, 11]
        int[][] arr ={{1,2,3,4,5,6,7,8,9},{10,11,12,13,14},{15,16,17,18,19,20}};
        int enkisalengt=arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            if (enkisalengt>arr[i].length){
                enkisalengt=arr[i].length;
            }
        }
        int[] arrTop =new int[enkisalengt];
        System.out.println(Arrays.toString(arrTop));

        for (int i = 0; i <arrTop.length ; i++) {
             arrTop[i]= arr[0][i]+arr[1][i]+arr[2][i];
        }
        System.out.println(Arrays.toString(arrTop));
    }
}
