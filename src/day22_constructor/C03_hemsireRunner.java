package day22_constructor;

public class C03_hemsireRunner {
    public static void main(String[] args) {
        /*
        bir obje olustururken parametre olarak hicbir deger girilmezse olusturulan obje ,
        olusturuldugu class'daki variable'ler atanan degerleri alir
        eger obje olusturulan class'dda deger atamasi yoksa , Java default degerleri atar.

         */
        C02_Hemsire hemsire1 =new C02_Hemsire();
        System.out.println(hemsire1.isim);
        System.out.println(hemsire1.evlimi);
        System.out.println(hemsire1.yas);
        System.out.println(hemsire1.izindeMi);
    }
}
