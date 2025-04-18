package day25_passByValue_immutableClasses;

import java.time.LocalTime;

public class C05_dateAndTime {
    public static void main(String[] args) {
        LocalTime saat = LocalTime.now();
        System.out.println(saat);
        System.out.println(saat.getNano());


        // bir loop ile 1 den 10000 kadar olan sayilari toplayin ve bu islemin
        // kac nano saniye sürdügünü bulun

        int toplam =0;
        int baslamaSuresiNano = saat.getNano();

        for (int i = 1; i <=10000 ; i++) {
            toplam+=i;
        }

        LocalTime saatSon=LocalTime.now();
        int bitisSuresiNano = saatSon.getNano();

        System.out.println("islem suresi : "+(bitisSuresiNano-baslamaSuresiNano));


    }
}
