package day05_Matematiksellslemle_Increament;

public class C03_IncrementDecrement {
    public static void main(String[] args) {

        int sayi = 10;
        // sayi variable'nin degerini 2 katinin 5 fazlasini yapin

        sayi=2*sayi+5;
        System.out.println(sayi);

        sayi=10;
        // ikinci yöntem
        sayi*=2;
        sayi+=5;
        System.out.println(sayi);

        sayi=10;
        sayi*=3;
        sayi-=3;
        sayi/=3;
        System.out.println(sayi);

        int a =10;
        int b =a;
        a++;
        System.out.println("a = "+a+
                "\nb = "+b);
        a=10;
        a++;
        b=a;
        System.out.println("a = "+a+
                "\nb = "+b);


    }
}
