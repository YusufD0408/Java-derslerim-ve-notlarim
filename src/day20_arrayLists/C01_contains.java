package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_contains {
    public static void main(String[] args) {
        // uzun bir listeyi java'da list olarak kaydetmek istersen
        // tek tek eklemek istemezseniz pratik olarak bir array
        // olusturup forloop ile liste ekleyebiliriz

        int[] arr ={2,3,5,4,6,7,8,6,9,8,4,2,6,8};
        List<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar);
        // listede element olarak 5 vami
        System.out.println(sayilar.contains(5));
        System.out.println(sayilar.contains(10));
       sayilar.clear();
        System.out.println(sayilar);

    }
}
