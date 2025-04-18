package day26_lokalTime_varargs;

import java.util.Arrays;

public class C09_VarargsDikkatEdilecekler {
    public static void main(String[] args) {
        // verilen sayilaarn ilki haric digerlerni toplasin
        // sonra toplam ile sayiyi carpip yazdirin
        topla(2,3,4,5,6,7);
    }
    /*
    public static void topla(int... a){
        System.out.println(Arrays.toString(a));
        int top =0;
        for (int each:a
        ) {
            top+=each;
        }
        System.out.println("Toplam :"+top);


    }
    dikkar edilecek 1
    iki method icn her ne kadar method sayisi farkli olsada varargs'in yapisi ndan dolayi int a ,int...b
    ile int.. b arasinda argument kabulu acisindan fark yoktur
    dikkat edilecek 2
    son sayiyi ayirmak istesek varargs eklenen tum parametreleri kendisi almak ister
    bundan dolayi bir methodda parametre larak varargs kullanilacaksa en son parametre olarak kullanilmalidir
    bir methodda parametre olarak iki varargs kullanilmaz
     */
    public static void topla(int c,int...a){
        System.out.println(Arrays.toString(a));
        int top =0;
        for (int each:a
        ) {
            top+=each;
        }
        System.out.println("istenen islem sonucu:"+top*c);
    }
}
