package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MDA {
    public static void main(String[] args) {
        int[][] arr ={{3,4,5},{2,3},{1}};
        // int [][] iki katli array belirtir
        // ilk[] ana array belirtir (outerArray) kontrol eder
        // ikinci [] ise icerdeki arrayleri (innerArray) kontrol eder
        System.out.println(arr[1][1]);// 3
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr.length);
        System.out.println(arr[1].length);
    }
}
