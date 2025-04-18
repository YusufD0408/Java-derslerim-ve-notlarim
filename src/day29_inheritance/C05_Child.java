package day29_inheritance;

public class C05_Child extends C03_ParentClass {
    int c =20;
    int a ;
    String s ="Child class";
    String m;

    public void method1(){
        System.out.println("child class method1");

    }

    public static void main(String[] args) {

        // Child classda bir obje olusturalim ve özelliklerini
        //yazalim

        C05_Child obj =new C05_Child();
        System.out.println(obj.a);
        System.out.println(obj.c);
        System.out.println(obj.b);
        System.out.println(obj.m);
        System.out.println(obj.s);
        System.out.println(obj.t);
        obj.method1();
        obj.method2();


    }
}
