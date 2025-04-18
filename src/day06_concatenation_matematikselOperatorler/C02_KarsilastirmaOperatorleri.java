package day06_concatenation_matematikselOperatorler;

public class C02_KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        b=2*a;

        //javada tek esittir isareti atama isaretidir karsilastirma isareti degildir

        // javada esitligi kontrol etmek istersek == kullaniriz
        System.out.println(b==2*a);// true

        System.out.println(3*b>5+a);

        System.out.println(b>=b-a);

        System.out.println(a<=b-a);
        // != esit degil operatoru

        //And(ve) operatru &&,&


    }
}
