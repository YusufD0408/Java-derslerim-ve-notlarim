package day29_inheritance;

public class C02_EncapsulationKullanimi {
    public static void main(String[] args) {
        C01 obj = new C01();
        obj.isim="Melike";
        System.out.println(obj.isim);

        obj.setSayi(40);
        System.out.println(obj.getSayi());

        /*
        Bir class uyesinin puplice olmasi ile private yapilip,
        getter ve setter method'larinin olusturulmasi
        islevsel acidan ayni sonucu olusturur



         bazi developer'lar set(write) ve get(read)  yetkilerinin kullanildigini vurgulamak
         icin 2. yöntemi tercih ederler.
         */
    }

}
