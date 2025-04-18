package day17_Arrays;

public class S02_Arrays {
    public static void main(String[] args) {
        //  Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //          method yaziniz.

        int [] arr ={1,2,3,4,5,6,7,8,9};

        System.out.println(arraydekiElementleriTopla(arr));
    }
    public static int arraydekiElementleriTopla(int [] sayilar){
        int elementlerToplami=0;
        for (int i = 0; i < sayilar.length; i++) {
            elementlerToplami +=sayilar[i];

        }
        return elementlerToplami;

    }
}
