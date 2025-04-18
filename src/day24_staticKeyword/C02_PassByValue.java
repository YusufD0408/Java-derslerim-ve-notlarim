package day24_staticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {
        int fiyat =200;
        /*
        Java ayni method icinde ayni isimde birden fazla variable olusturmasina izin vermez
         */
        indirimYap10(fiyat);
        System.out.println(fiyat);
        indirimYap25(fiyat);
        System.out.println(indirimliFiyatiGetir(fiyat));
        fiyat=400;
        System.out.println(fiyat);

        /*
        main method icindeki variableyi kalici degistirmek icin main methot icinde atama yapilmali
         */





    }
    public static void indirimYap10(double fiyat){// double fiyat = degeri methodun cagrildigi yerler
        fiyat=fiyat*0.9;
        System.out.println("%10 indirimli fiyat : "+fiyat);
    }
    public static void indirimYap25(double fiyat){// double fiyat = degeri methodun cagrildigi yerler
        fiyat=fiyat*0.75;
        System.out.println("%25 indirimli fiyat : "+fiyat);
    }
    public static double indirimliFiyatiGetir(double fiyat){// double fiyat = degeri methodun cagrildigi yerler
        fiyat=fiyat*0.9;
        System.out.println("%10 indirimli fiyat : "+fiyat);
        return fiyat;
    }



}
