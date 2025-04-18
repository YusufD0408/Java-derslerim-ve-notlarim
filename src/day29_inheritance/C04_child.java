package day29_inheritance;

public class C04_child extends C03_ParentClass{

    int c =20;
    int a ;
    String s ="Child class";
    String m;

    public void methot1(){
        System.out.println("child class method2");

    }

     public static void main(String[] args) {
C03_ParentClass objC03  = new C03_ParentClass();
    objC03.a=20;
    objC03.b=22;
    objC03.s="p";
    objC03.t="k";
    objC03.method1();
    objC03.method2();


    C04_child objC04 =new C04_child();
    objC04.a=50;
    objC04.c=20;
    objC04.s="u";
    objC04.m="l";
    objC04.methot1();

    objC04.b=30;
    objC04.t="g";
    objC04.method2();



    /*
    Javada parent classlar chil edilmez
    child classlar parent edilir
    Bir class'in paska bir classdaki tum özellikleri
    otomatik olarak edinmesini istiyorsak clasimizi
    extends keyword ile o cllas'a child yapariz


    C04 classsda olmayip C03e child yapinca child classda olmayip
    parent classda olan b,t ve method2 ozellik olarak obj04'e
    eklendi
     */




    }

}
