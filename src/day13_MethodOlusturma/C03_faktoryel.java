package day13_MethodOlusturma;

public class C03_faktoryel {
    public static void main(String[] args) {
        // verdigimiz bir sayinin faktoryelini hasaplayip sonucu bize dnduren bir methd olusturun
       int sonuc= faktoryelHesapla(5);


    }
    public static int faktoryelHesapla(int sayi ){
        int fatoryel=1;
        for (int i = sayi; i>=1 ; i--) {
            fatoryel*=i;
        }
        return fatoryel;
    }
}
