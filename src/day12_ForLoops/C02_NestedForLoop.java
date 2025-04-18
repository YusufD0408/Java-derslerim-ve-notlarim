package day12_ForLoops;

public class C02_NestedForLoop {
    public static void main(String[] args) {
        // verilen bir rakam icin carpim talosu olusturun
        int sayi =4;
        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=sayi ; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println("*************");
        for (int i = 1; i <=sayi ; i++) {
            for (int j = 1; j <=sayi ; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println("");

        }

    }
}
