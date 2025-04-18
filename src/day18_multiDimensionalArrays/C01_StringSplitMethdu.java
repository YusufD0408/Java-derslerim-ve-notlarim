package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C01_StringSplitMethdu {
    public static void main(String[] args) {
        //Bir stringi istedigimiz parcalara ayrmak icin kullanilir


        String str ="Java candir can";
        // str kac kelimedir
        String [] kelimeler =str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        System.out.println("Kelime sayisi : "+kelimeler.length);
        // en uzun kelime kac harflidir
        int  enUzunKelimelengt = kelimeler[0].length();
        for (int i = 0; i < kelimeler.length; i++) {
            if (kelimeler[i].length()>enUzunKelimelengt){
                enUzunKelimelengt=kelimeler[i].length();
            }
        }
        System.out.println("En Uzun kelimenin karakter sayisi : "+enUzunKelimelengt);
     // Bir stringi karakterlerine ayirmak istersserk

        String[] karakterler =str.split("");
        System.out.println("karakterler : "+Arrays.toString(karakterler));
        System.out.println("Cumledeki karakter sayisi : "+karakterler.length);
    }

}
