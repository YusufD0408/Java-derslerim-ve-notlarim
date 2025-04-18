package day23_constructor;

public class Araba {

    int yil;
    String marka="Marka belirtilmemis";
    String model="Model belirtilmemistir";
    boolean hasarlimi;
    int fiyat;

    @Override
    public String toString() {
        return "Araba Bilgileri {" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarlimi=" + hasarlimi +
                ", fiyat=" + fiyat +
                '}';



    }


    public Araba(int yil,String marka,String model,boolean hasarlimi, int fiyat){
        // Eger parametre ismi instance variable ismi ile ayni degilse bir alrraki constructore
        // oldugu gibi direk atama yapabiliriz

        // Ancak genelde projenin daha anlasilir olmasi ve dogr variable'in
        // kullanilmasi icin consructor'daki
        // parametre isimleri ,instance variable'ler ile ayni secilir
        //bu durum Java'ya ayni isimdekiiki variable'da hangisinin bu class'daki
        // instance variable oldugunu belirtmemz gerekir

        // bunun icin Java syntax olarak this yazilmasini istemistir
        this.yil=yil;
        this.marka=marka;
        this.model=model;
        this.hasarlimi=hasarlimi;
        this.fiyat=fiyat;
    }
    public Araba(int fyt,String mrk){
        fiyat=fyt;
        marka =mrk;
    }

    public Araba(int yil, String marka, String model, int fiyat) {
        this.yil = yil;
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    public Araba(){

    }
    public void yakitTuketimi(String yakitTuru){
        switch (yakitTuru){
            case "Benzin":
                System.out.println("benzinli araclar icin yakit tuketimi : 6 l/100 km");
                break;
            case "Dizel":
                System.out.println("Dizel araclar icin yakit tukemi 5 l/100 km");
                break;
            case "Elektrik":
                System.out.println("Elektrikli araclar icin yakit tuketimi 5 kw/100 km");
                break;
            default:
                System.out.println("gecersiz yakit tuketimi");
        }
    }

}
