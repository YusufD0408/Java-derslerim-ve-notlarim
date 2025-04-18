package day17_Arrays;

import java.util.Arrays;

public class S07_Arrays {
    public static void main(String[] args) {
        //   Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //           eski array’e yeni degeri atayin.
        int[] arr = {1,2,3,4,5};
       arr= arrayeElemaneklemeMethodu(arr,6);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] arrayeElemaneklemeMethodu(int[] arr,int eklenecekEleman){
      int[] yeniArr =new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekEleman;
        return yeniArr;
    }
}
