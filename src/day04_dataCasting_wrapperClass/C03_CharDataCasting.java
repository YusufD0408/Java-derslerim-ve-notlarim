package day04_dataCasting_wrapperClass;

public class C03_CharDataCasting {
    public static void main(String[] args) {
        char ch1 ='a';
        int sayi1 =ch1;
        System.out.println("ch1 :"+ch1);
        System.out.println("sayi1 :"+sayi1);// asci table
        // verılen ntıger sazının ascı tablosundakı char karsılıgını yazın

        int karakter =97;
        char yeniKarakter =(char) karakter;
        System.out.println("karakter : "+yeniKarakter);
    }
}
