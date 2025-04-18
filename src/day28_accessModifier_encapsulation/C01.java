package day28_accessModifier_encapsulation;

public class C01 {


    String str ; // class level'daki class uyesinin access modofier'i olur
    // eger access modifier gorunuyorsa Java a class UYESINi defauld access modifier olarak atar

    static  String s;
    public static  int a;
    private int b;
    private static  int c =10;

    public static  int f;
    public  int d;

    public C01() {
    }

    public static void main(String[] args) {

        int sayi =10;
        // static String b ;
        // bir methot icerisinde puplic , protected ,private gibi access modifier'lar
        // veya static keyword KULLANILAMAZ

        s="hava";
        a=10;
        //d=27;

    }
    void method(){
        str ="java";
        a=10;
        b=20;

    }
    static  void  methid2 (){

    }
public  void  method3 (){ 

}
}
