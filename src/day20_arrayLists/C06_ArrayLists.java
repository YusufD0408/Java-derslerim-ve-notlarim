package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_ArrayLists {
    public static void main(String[] args) {
        List<Integer> sayilar =new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(10);



        // 2. indexteki element ile 5. index'deki elementin yerini degistirin
        System.out.println(sayilar);
        System.out.println(sayilar.get(2));
        int temp = sayilar.get(2);
        sayilar.set(2,sayilar.get(5));
        sayilar.set(5,temp);
        System.out.println(sayilar);



    }
    public static List<Integer> sayilar1 (List<Integer> liste,int ilkIndex,int ikinciIndex){
        List<Integer> yeniList =new ArrayList<>();
       int temp = yeniList.get(ilkIndex);
       yeniList.set(ilkIndex,yeniList.get(ikinciIndex));
       yeniList.set(ikinciIndex,temp);
       return yeniList;
    }

}
