package day25_passByValue_immutableClasses;

public class C03_immutableClass {
    public static void main(String[] args) {
        // Javada bir class ve o class'dan olusturulan objeler ya mutable'dir ya da immutabledir
        // Java metinsel ifadeleri atayabilecegimiz uc class olusturmustur
        // String           immutable
        // StringBuilder    mutable
        // StringBuFfer      mutable
        /*
        Immutable bir classdan lusturulan bjelerde immutabledir
        String immutable oldugnda ayni str objesine yeni deger atandiginda Java eski degeri degistiremez bunun
        yerine istenen degere sahip yeni bir obje olusturur ve str 'n yeni bjeye yonlendirir
        kullanilmayan eski objeler Garbage Collecror tarafindan ynlendirir

         */
        String str = "Java candir";
        str=str.toLowerCase();
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);

        String s ="Hava";
        for (int i = 0; i <100 ; i++) {
            s =s + " ,";
        }
        System.out.println(s);
    }
}
