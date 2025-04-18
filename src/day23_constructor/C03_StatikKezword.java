package day23_constructor;

public class C03_StatikKezword {
    static String hastahaneismi="Yildiz Hastanesi";
    static String hastanetelefonu="321456789";
    static String bashekimIsmi="Kemal Aydin";

    String personelIsmi;
    String personelAdresi;
    String personelTelefonu;

    public static void main(String[] args) {
        C03_StatikKezword personel1 =new C03_StatikKezword();
        System.out.println(personel1.personelIsmi);
        System.out.println(hastahaneismi);

        C03_StatikKezword personel2 =new C03_StatikKezword();
        personel2.personelIsmi="Dogan";
        System.out.println(personel2.personelIsmi);
        System.out.println(personel1.personelIsmi);

        personel2.bashekimIsmi="Yusuf Dogan";
        System.out.println(personel1.bashekimIsmi);




        /*
        ststik varable'ler tum class icin gecerlidir(class variable)
        statik variable'ler tum objeler icin ayni degeri tasidiklari icin
         her obje icin ayrica olusturulmaz ,sadece 1 tane variable olur
         statik variable'ler ulasmk veya update etmek cin obje ismi kullanmaya gerek yoktur
         direk ulasilabilir.
         Baska class'dan statik variable'a ulasmak icin clasismi statik variableismi yazilr
         */
    }

}
