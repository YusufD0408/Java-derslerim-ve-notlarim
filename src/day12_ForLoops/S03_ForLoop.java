package day12_ForLoops;

import java.util.Scanner;

public class S03_ForLoop {
    public static void main(String[] args) {
        //   Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //   dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //   baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen baslangic degeri icin pozitif bir tamsayi giriniz");
        int baslangicDegeri = scan.nextInt();
        System.out.println("Lütfen bitis degeri icin pozitif bir tamsayi giriniz");
        int bitisDegeri = scan.nextInt();
        int toplam=0;

        if (baslangicDegeri>bitisDegeri){
            System.out.println("baslangic degeri bitis degerinden kucuk olmalidir");
        }else {
            for (int i = baslangicDegeri; i <=bitisDegeri; i++) {
                toplam+=i;

            }
        }
        System.out.println("Sayilarin toplami : "+toplam);

    }
}
