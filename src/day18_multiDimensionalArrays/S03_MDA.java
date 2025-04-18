package day18_multiDimensionalArrays;

import java.util.Arrays;

public class S03_MDA {
    public static void main(String[] args) {
        //   Soru 3- Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni
        //           olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //  input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        //  output: [10, 3, 12, 10, 9]
        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        int[] yeniArr =new int[arr.length];
        System.out.println(Arrays.toString(yeniArr));
           int top =0;
        for (int i = 0; i <yeniArr.length ; i++) {
            top=0;
            for (int j = 0; j < arr[i].length; j++) {
                top+=arr[i][j];
            }
            yeniArr[i]=top;
        }
        System.out.println(Arrays.toString(yeniArr));
        }
    }

