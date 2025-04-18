package day15_doWhileLoop_scope;

public class C06_ClassLevelVariable {
    //bir Class icinde tum methodlarin erisebilecegi variableler istenise
    // Class Level 'da olusturulmalidir [Classin icinde ama methdlarin disinda]

    // 1- class level'da olusturulan variable'lerin scope'u tum class'dir
    // 2- class levelde lutirulan variablelere deger atanmasada
    // ble javada onlar icin tanimlanmis defauld deer atanir
    // 3- class levelde olusturulan variablelere static veya instance (static olmayan) olabilir
    // 4- static olarak tanimlanan variable'ler tum method'larda direk kullanilabilir
    // 5- method static ise icine static olmayan variable almaz
    //6-
    static int sayi =10;
    static String isim;
    static boolean bl;
    static char chr ;
    static int sa ;
    public static void main(String[] args) {
        sayi=sayi+10;
        System.out.println(sayi);

    }
    public static void staticMethod(){
        sayi++;
        System.out.println(sayi);
    }
    public void staticOlmayanMethod(){
      sayi--;
        System.out.println(sayi);
    }
}
