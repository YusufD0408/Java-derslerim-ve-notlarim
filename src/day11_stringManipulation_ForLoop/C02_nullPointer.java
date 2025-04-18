package day11_stringManipulation_ForLoop;

public class C02_nullPointer {
    public static void main(String[] args) {
        // null bir deger degildir
        // null bir pointerdir
        // yanina yizildi non primitive variableye deger atanamadigini isaret eder
        String str;
        // java metd icerisinde deger atanmada varible olusturulmasina izin verir
        // ama deger atanmadan kullanilmasina izin vermez
        str=null;
        System.out.println(str);
      //  System.out.println(str.concat("java"));
        String str2=str+"java";
        System.out.println(str2);
      //  System.out.println(str.isEmpty());
        // null larak isaretlenen bir string hicbr metodla kullanilamaz sadece yazdirilabilir
        // veya + ile kulanilbilir
    }
}
