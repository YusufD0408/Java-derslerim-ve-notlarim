package day04_dataCasting_wrapperClass;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {
        double dbl1=123.6;
        int sayi1 =(int) dbl1;
        System.out.println("Sayi : "+sayi1);
        byte by1 =(byte) sayi1;
        System.out.println("by1 : "+by1);

        int sayi2 =130;
        byte by2 =(byte) sayi2; //-126   byt -128  +127 arasinda dwger alir.


    }
}
