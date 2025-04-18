package day27_stringBuilder;

public class C03_equals_compare {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str ="Java";
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
        // StringBuilder icerik ayni olsa bile equls methodu  false doner
        //  Cunku StringBulider Class'inda equls methodu yoktur

        // bu durumda iki stringBuilding'in iceriklerinin ayni oldugu kontrol etmek icin
        // compaireTo() kullanilir
        System.out.println(sb1.compareTo(sb2));
        StringBuilder sb3 = new StringBuilder("Hava");
        StringBuilder sb4 = new StringBuilder("Hara");
        System.out.println(sb1.compareTo(sb3));
        System.out.println(sb1.compareTo(sb4));
        System.out.println(sb3.compareTo(sb4));
        System.out.println(sb4.compareTo(sb3));

        /*
        CompairTo() karsilastirilan StringBuilder 'lar ayni metne sahipse 0 doner Ayni degilse ,
        bastan itibaren kontrole baslar  farkli olan ilk harfin karsilastirilan
        kelimedekiayni index'deki harften kac harf ilerde oldugunu dondurur
         */
    }
}
