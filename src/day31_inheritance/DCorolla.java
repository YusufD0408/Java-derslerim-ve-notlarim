package day31_inheritance;

public class DCorolla extends CToyota{

    String str3 = "Corolla";

    DCorolla(){
        System.out.println("Parametresiz Corolla constructor calisti");
    }

    DCorolla(int sayi){
        super(8);
        System.out.println("Int Parametreli Corolla constructor calisti");
    }

    public static void main(String[] args) {
        DCorolla obj1 = new DCorolla(5);
    }

    /*
    Biz görünür bir constructor olusturdugumuzda javanin defauld
    constructor ssilmesine benzer olarak
    Extends keyword kullanilmis bir classdaki
    herhangi br constructor ilk satirina gözle görünür
    birconstructor call yazilmissa defauld supr siler 
     */

}
