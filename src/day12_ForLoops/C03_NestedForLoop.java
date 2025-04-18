package day12_ForLoops;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        // Dinamik olarak verilen satir ve sutun sayyisina gore yildizlardan bir dikdortgen olusturun
        int satirSayisi =3;
        int sutunSayis=5;
        for (int i =1; i <=satirSayisi ; i++) {
            for (int j = 1; j <=sutunSayis ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("******");

    }
}
