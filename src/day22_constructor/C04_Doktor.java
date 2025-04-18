package day22_constructor;

public class C04_Doktor {
    C04_Doktor(){
        System.out.println("paramertesi atanmamis constructor");
    }
    String isim;
    String soyisim;
    String telNo;
    int yas;
    boolean izindeMi;
    char evlimi ;
    int ekMesaiUcreti=30;

    public int MesaiucretiHesapla(int mesaiSaati) {
        return mesaiSaati * ekMesaiUcreti;
    }
}
