package day13_MethodOlusturma;

public class S04_MethodOlusturma {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        //         bolenleri sayisini bulup bize donduren bir method olusturun.
        System.out.println(pozitifBolenSayisi(21));
    }
    public static int pozitifBolenSayisi(int sayi){
        int bolenSayisi =0;
        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                bolenSayisi++;
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        return bolenSayisi;
    }
}
