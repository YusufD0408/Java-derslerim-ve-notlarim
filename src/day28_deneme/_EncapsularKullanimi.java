package day28_deneme;

import day28_accessModifier_encapsulation.C03_EncapsularDatalar;

public class _EncapsularKullanimi {
    public static void main(String[] args) {
        System.out.println(C03_EncapsularDatalar.getIsim());
        C03_EncapsularDatalar obj =new C03_EncapsularDatalar();
        obj.setSatisTutari(100);
        obj.setSatisTutari(200);
        obj.setSatisTutari(300);
        System.out.println("Toplam satis : "+obj.toplamSatis);
           /*
        C03_EncapsularDatalar Class'ndaki isim variable'inin degeri gorunsun
        ama degistirilmesin satisTutari ise deger girilebilsin ama girilen deger
        sonradan degistirilemezsin


        Eger bir variable icin read veya write ozelliklerinin birbirinden
        ayrilmasini isteniyorsa oncelikle access modifier ile kimsenin ulasammasini
        saglayin

        private yaparak kimsenin ulasamayacagini garantiye alarak
        read yetkisi vermek istediklerimiz icin getter()
        write yetkisi vermek istediklerimiz icin setter()olusturmaliyiz

         */
    }
}
