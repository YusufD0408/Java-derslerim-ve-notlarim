package day22_constructor;

public class C02_Hemsire {
    /*
    ornegin bir hastahane programinda, hastahanede calisacak hemsirelerin hangi bilgilerini istiyorsak,
    hangi methodlari hesirelerde kullanmak istiyorsak
    bir hemsire clasi olusturup tum bu ozellikleri(variable ve methodlar) oclass'da olustururuz

    programda ne zaman bir ihtiyac olsa hemsire class'indan obje olustururuz
    boylece otomatik olarak buozelliklere sahip olur

    eger biz istedigimiz parametrelere sahip bir constructor
     olusturmazsak Java class'dda obje olsturabilmesi icin class'a default bir constructor koyar.
     default constructer GORUNMEZ,
     parametresi yoktur ,cons.body'si bostur

     biz de  istedigimiz paramatrelere sahip
     istedigimiz kadar constructor olusturabiliriz

     cok onemli eger biz bir constructor olustursak
     yani class'da gozle gorunen bir constructor varsa Java default constructer'i siler

     bizim olusturdugumuz hicbir  constructor'a default constructor denemez


     */
    String isim;
    String syisim;
    String telNo;
    int yas;
    boolean izindeMi;
    char evlimi ;
    int ekMesaiUcreti=20;

    public int MesaiucretiHesapla(int mesaiSaati){
        return mesaiSaati*ekMesaiUcreti;
    }








}
