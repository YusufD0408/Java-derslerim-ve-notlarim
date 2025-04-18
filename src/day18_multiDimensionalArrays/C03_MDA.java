package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C03_MDA {
    public static void main(String[] args) {
        String[][] siniflar ={{"A","B","G","M"},{"F","P","A","V"},{"K","D","Q"}};
        System.out.println(siniflar[0][2]);
        siniflar[2][2]="Y";
        System.out.println(Arrays.deepToString(siniflar));
        // ilk sinifin mevcudu
        System.out.println(siniflar[0].length);
        // siniflar'da toplam kac kisi ldugunu yazdirn
        int toplamOgSayisi =0;
        for (int i = 0; i < siniflar.length; i++) {
           toplamOgSayisi+= siniflar[i].length;

        }
        System.out.println("Toplam ogrenci sayisi : "+toplamOgSayisi);
    }
}
