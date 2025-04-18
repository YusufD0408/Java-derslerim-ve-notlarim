package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_baskaClasstanCalistirma {
    public static void main(String[] args) {
        // S03 'deki istenmeyenleer sil methodunu buradan kullanalim
        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Cikolatali Gofret");
        urunler.add("Cokoprens");
        urunler.add("Cokomel");
        String istenmeyenHarf ="o";
        System.out.println(S03_ArrayLists.istenmeyenHarfIcerenleriSil(urunler, istenmeyenHarf));
    }
}
