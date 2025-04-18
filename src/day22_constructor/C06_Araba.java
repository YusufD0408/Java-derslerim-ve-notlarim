package day22_constructor;

public class C06_Araba {
    int yil;
    String marka="Marka belirtilmemis";
    String model="Model belirtilmemistir";
    boolean hasarlimi;
    int fiyat;

    // bir obje olustururken default constructor veya parametresiz gorunur
    // constructor kullanilmadan obje ilk atanan degerlere sahp olur
    // istedigimiz degerleri atamak icin tek tek tum variable'lara atama yapmamiz gerekir
    //  Bunun yerine
    // atamak istedigimiz degerleri parametre olarak constructor'a yollayalim
    // ve atamalari constructorbicinde yapalim.
    public  C06_Araba(String mrk,String mdl,boolean hmi,int yil,int fyt){
        yil= yil;
        marka =mrk;
        model=mdl;
        fiyat=fyt;


    }
public C06_Araba(){

}
    @Override
    public String toString() {
        return "Araba Ozellikleri{" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarlimi=" + hasarlimi +
                ", fiyat=" + fiyat +
                '}';
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
