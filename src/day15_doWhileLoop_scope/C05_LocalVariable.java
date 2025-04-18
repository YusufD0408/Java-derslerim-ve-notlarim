package day15_doWhileLoop_scope;

public class C05_LocalVariable {
    public static void main(String[] args) {
        /*
        1- Bir method icerisinde olusturulan variablenin scopu o methoddur baska bir methdda kullanilamaz
        bu variable'lere local variableler denir.
        2- Her ne kadar bir method icinde olsalarda looplarin ayri bir scpo vardir loop
         icerisin ulusturulan variableler
        looplarin disinda kullanilamaz
        3- local variblelere  deger atanmadan olusturabiliriz ama deger atanmadan kullanamayiz
         */
        String isim="Ali Can";
        //sayi++; kullanilamaz
    }
    public static void baaskaMethod(){
       // System.out.println(isim); kullanilmaz
        int sayi =5;
    }
}
