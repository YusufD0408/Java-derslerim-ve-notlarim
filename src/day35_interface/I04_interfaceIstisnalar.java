package day35_interface;

public interface I04_interfaceIstisnalar {

    void toplama ();


    static void aciklama(){
        System.out.println("Bu method'u implement etmek mecburi degil");

    }
    default void eksikler(){
        System.out.println("Default keyword ile body'si olan metdod olusturulabilir");
    }





}
