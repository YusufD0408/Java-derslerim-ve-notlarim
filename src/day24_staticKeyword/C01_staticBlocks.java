package day24_staticKeyword;

public class C01_staticBlocks {
    C01_staticBlocks(){
        System.out.println("Constractir calisti");
    }
    public static void main(String[] args) {
        System.out.println("Main method calisti");
        System.out.println("=============");
        C01_staticBlocks obj =new C01_staticBlocks();
    }
    static {
        /*
        static bloclar clas ilk calismaya basladiginda calisir
        genel olarak class icin gerekli ayarlari yapmak icin kullanilir
        birden fazla static bloc varsa yukaridan asagiya dgru calisirlar

         */
        System.out.println("Static block calisti");
    }
    {
        /*
        static olmayan bloclar ise obje olusturulurken constroctir once calisir
        obje icin yapilmasi gereken n ayarlamalari yapmak icin kullanilir
         */
        System.out.println("Static olmayan bloc calisti");
    }
}
