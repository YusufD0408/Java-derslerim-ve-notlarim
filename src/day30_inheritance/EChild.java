package day30_inheritance;

public class EChild extends DParentAccessModifier{
    static int sayiChildStatic;



    public static void main(String[] args) {
        // inhetitance private class uyeleri inherit edilemezler




        EChild eChild=new EChild();
        System.out.println(eChild.sayiDefault);
        System.out.println(eChild.sayiProtected);
        System.out.println(eChild.sayiPublic);


         // icinde bulundugumuz class'daki static variablelar obje uzerinden otomatik gelmez
        //ama manuel yazdigimizda Java kabullenir
        System.out.println(eChild.sayiChildStatic);

        // ancak parent class'daki static variableler obje uzerinden KULLANILMAZ

        System.out.println(DParentAccessModifier.sayiStaticProtected);
        /*
        Bu kullanim icin inheritance'a ihtiyac yok
        her hangi bir class'daki static variable'i
        classIsmi.staticVariableIsmi seklinde kullanabiliriz
        
         */
    }

}
