package day15_doWhileLoop_scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
        While loop'da bitis sarti kontrolu her zaman body'den bir fazla calisir
        While loop'da kullanicidan alacagimiz degerler once bizim deger
        atamamamiz gerekir buda bazen hatalara sebep olur
         */


        int sayi =10;
        int toplam=0;
        while (sayi>0){
            toplam+=sayi*sayi;
            sayi--;
        }
        System.out.println("While ile toplam = "+toplam);

        sayi=10;
        toplam=0;
        do {
            toplam+=sayi*sayi;
            sayi--;
        }while (sayi>0);



        System.out.println("Do while ile toplam = "+toplam);


    }
}
