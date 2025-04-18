package day05_Matematiksellslemle_Increament;

public class C04_Preincreament_Postincreament {
    public static void main(String[] args) {
        int a = 20;
        int b =10;
        b=2*a;
        System.out.println("b = "+b+" a = "+a);
        a=b-5;
        System.out.println("b = "+b+" a = "+a);
     //önce a'nin degerini b'ye atayin sonra a'yi yazdirin
        a=10;
        b=a++;
        System.out.println("b = "+b+" a = "+a);
     // once a'nn degerini bir artirin sonra a'nin degerini b'ye atayin
        a=10;
        b=++a;
        System.out.println("b = "+b+" a = "+a);
        /*
        bu kullanm sadece a++,a--,++a,--a icin var
        burada ++ veya --'yi öncemi yoksa sonrami kullanacagimiza
        bizden sonra istenen duruma göre karar veririz

         */

        a=20;
        System.out.println(a++);
        System.out.println(a);

        a=20;
        System.out.println(--a);
        System.out.println(a);
    }
}
