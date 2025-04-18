package day28_accessModifier_encapsulation;

public class C02 {
    public static void main(String[] args) {
        C01 obj =new C01();
       // System.out.println(obj.b);  access modofier private
        // System.out.println(C01.c); access modifier private
   obj .str="tava";
   C01.s="Tava";

        C01.a=100;
        obj.d=140;


    }


}
