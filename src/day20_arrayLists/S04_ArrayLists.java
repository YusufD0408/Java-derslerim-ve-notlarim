package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class S04_ArrayLists {
    public static void main(String[] args) {
        //  Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
        //  sayisini bir list olarak donduren bir method olusturun.(0,1,1,2,3,5,8)
        int sayiadedi=10;
        System.out.println(istenenSayidaFibonacciSayisiListele(sayiadedi));
    }
    public static List<Integer> istenenSayidaFibonacciSayisiListele(int sayiAdedi){
        List<Integer> fibonacciSerisi =new ArrayList<>();


        if (sayiAdedi<=0){
            System.out.println("Hatali giris, Lütfen pozitif bir tamsayi giriniz");
        } else if (sayiAdedi==1) {
            fibonacciSerisi.add(0);
        } else if (sayiAdedi==2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        }else {
            int ilkSayi=0;
            fibonacciSerisi.add(0);
            int ikinciSayi=1;
            fibonacciSerisi.add(1);
            int yeniSayi=ilkSayi+ikinciSayi;
            fibonacciSerisi.add(yeniSayi);
            while (fibonacciSerisi.size()<sayiAdedi){
                ilkSayi=ikinciSayi;
                ikinciSayi=yeniSayi;
                yeniSayi=ilkSayi+ikinciSayi;
                fibonacciSerisi.add(yeniSayi);

            }

        }return fibonacciSerisi;
    }
}
