package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S03_ArrayLists {
    public static void main(String[] args) {
        // Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        // kismini list olarak bize donduren bir method olusturun

        List<String> liste = S02_ArrayList.isimler();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kullanilmasini istemediginiz bir harf giriniz");
        String istenmeyenHarf =scan.next().substring(0,1);

        List<String> ayiklanmisList=istenmeyenHarfIcerenleriSil(liste,istenmeyenHarf);
        System.out.println(ayiklanmisList);

    }

    public static List<String> istenmeyenHarfIcerenleriSil(List<String> liste, String istenmeyenHarf) {

        // mesela listemiz  ali , veli , ayse , fatma, ve istenmeyen harf a
        // forloop ile elementleri ele alirken remove yapaarsak listenin uzunlugu
        //degisecegi icin srun yasariz
        // farkli bir list olusturup silinmeyenleri yeni birliste atariz
        List<String> kalanlarListesi =new ArrayList<>();
        for (int i = 0; i < liste.size(); i++) {
            if (!liste.get(i).contains(istenmeyenHarf)){
                kalanlarListesi.add(liste.get(i));
            }
        }
        return kalanlarListesi;


    }
}
