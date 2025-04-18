package day17_Arrays;

import java.util.Arrays;

public class C08_sort_binarySearch {
    public static void main(String[] args) {
        // verilen bir array naturel ordere gore siralamak icin Arrys.sort() kullaniriz
        int[] arr1 ={3,9,7,2,6};
       Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        String[] arr2 ={"Hasan","Huseyin","Mehmet","Mercan","ali"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        // sort yapildiktan sonra arrayde bir elementin var oldugunu kontrul etmek icn
        System.out.println(Arrays.binarySearch(arr2,"ali"));
    }
}
