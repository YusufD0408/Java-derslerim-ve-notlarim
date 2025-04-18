package day16_Scop_arrays;

public class C01_Hastane {
    public static void main(String[] args) {
        ADoktor doktor1 =new ADoktor();
        System.out.println(doktor1.askerlikYaptimi);
        doktor1.isim="Kemal";
        doktor1.soyisim="Yilmaz";
        doktor1.dogumYili=1990;
        System.out.println();// yazmaz cunku scopu burasi degil
        System.out.println(doktor1.isim);


        ADoktor dok2=new ADoktor();
        System.out.println(dok2.isim);
        dok2.soyisim="Celik";
        System.out.println(dok2.soyisim);

        System.out.println(doktor1.fakulte);
        System.out.println(dok2.fakulte);

        doktor1.isim="Burcu";
        doktor1.fakulte="Tip fakultesi";
        System.out.println(dok2.fakulte);

        ADoktor dok3 =new ADoktor();
        System.out.println(dok3.dogumYili);
        System.out.println(dok3.fakulte);

        System.out.println(ADoktor.fakulte);
        // static variableler icin tavsiye edilen erisim yontemi class ismi.staticuyeismi seklinde yazimidir
    }
}
