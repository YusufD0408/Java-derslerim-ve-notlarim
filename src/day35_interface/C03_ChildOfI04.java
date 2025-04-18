package day35_interface;

public class C03_ChildOfI04 implements I04_interfaceIstisnalar{
    @Override
    public void toplama() {
    }

    public static void main(String[] args) {
        C03_ChildOfI04 obj =new C03_ChildOfI04();
        obj.eksikler();
        obj.toplama();
        I04_interfaceIstisnalar.aciklama();
    }


}
