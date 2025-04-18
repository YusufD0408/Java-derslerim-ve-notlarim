package day19_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_tekrarlardanKurtulma {
    public static void main(String[] args) {
        // verilen bir arrayda tekrar eden sayilari silip
        // her bir elementin sadece bir kez kullanildigi bir hale donusturme
        int[] arr = {3,4,5,2,4,5,7,7,8,9,1,3,6,4,3,9,0,6};
            //  bir tane bos bir list olusturalim arraydeki herbir
        //  elemeti ele alalim  ele aldigimiz
        //  element list'de yoksa ekleyelim ,varsa eklemeyelim
        // boylece benzersiz elementlerden olusan bir list olusturalim
        List<Integer> benzersizElementlerList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
           if (!benzersizElementlerList.contains( arr[i])){
               benzersizElementlerList.add(arr[i]);

           }
        }
        System.out.println(benzersizElementlerList);
        // istenen listeyi list olarak elde ettik
        // bunu arr'ye direk atayamayz
        arr=new int[benzersizElementlerList.size()];
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=benzersizElementlerList.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
