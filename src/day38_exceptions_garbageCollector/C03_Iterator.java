package day38_exceptions_garbageCollector;

import java.sql.Array;
import java.util.Arrays;

public class C03_Iterator {
    public static void main(String[] args) {
        int[] arr ={3,8,1,9,15};
        // tum elementleri yazdirin
        // for each
        for (int each:arr
        ){
            System.out.print(each + "  ");
        }
        System.out.println("");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        // Index kullanmadan tum elemanlarin 3 artirip kaydetsin
        // Index istemedigi icin normal loop kullanilmaz
        // for-eac loop ile deneyelim

        System.out.println("");

        for (int each : arr
        ){
            each=each+3;
            System.out.print(each+"  ");

        }
        System.out.println("");

        System.out.println(Arrays.toString(arr));
        System.out.println("arry degismedi cünkü indexi kullanmadi yani loop icinde kalan loopta kalir");


    }
}
