package day20_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S01_ArrayList {
    public static void main(String[] args) {
        //  Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //          elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
        int[] arr ={1,2,3,4,5,6,4,4,3,5,7,8,9,0,1};
        System.out.println("Tekrarli liste                     : "+ Arrays.toString(arr));
        /*List<Integer> benzersizList =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!benzersizList.contains(arr[i])){
                benzersizList.add(arr[i]);
            }
        }
        System.out.println(benzersizList);
         */
        System.out.println("Metotla ayiklanmis tekrarsiz liste : "+benzersizList(arr));
    }
    public static List<Integer> benzersizList(int[]arr){
        List<Integer> yeniList =new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            if (!yeniList.contains(arr[i])){
                yeniList.add(arr[i]);
            }
        }return yeniList;
    }
}
