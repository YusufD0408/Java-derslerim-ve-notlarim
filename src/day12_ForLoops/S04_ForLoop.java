package day12_ForLoops;

import java.util.Scanner;

public class S04_ForLoop {
    public static void main(String[] args) {
        //  Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //  dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //  baslangic degerinden kucuk olsa da program calissin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen baslangic degeri icin pozitif bir tamsayi giriniz");
        int baslangicDegeri = scan.nextInt();
        System.out.println("Lütfen bitis degeri icin pozitif bir tamsayi giriniz");
        int bitisDegeri = scan.nextInt();
        int toplam=0;

        if (baslangicDegeri<=bitisDegeri){
            for (int i = baslangicDegeri; i <=bitisDegeri; i++) {
                toplam+=i;

            }

        }else {
            for (int i = baslangicDegeri; i >=bitisDegeri; i--) {
                toplam+=i;

            }
        }
        System.out.println("Sayilarin toplami : "+toplam);

    }
}
