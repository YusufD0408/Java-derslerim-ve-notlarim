package day17_Arrays;

import java.util.Arrays;

public class day18_MultiDimensionalArrays {
    public static void main(String[] args) {
        // verilen bir array'de istenen bir elementin var olup olmadigini bulma
        int[] arr = {4,9,1,5,11,3,7,4,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.binarySearch(arr, 11));
        System.out.println(Arrays.binarySearch(arr, 2));
        System.out.println(Arrays.binarySearch(arr, 8));

        // arayde binarry searc dogru calismasi icin once sor calistirilmalidir
        // aranan elementin indexini doner

    }
}
