package day38_exceptions_garbageCollector;

public class C02_Final_Finaly {


    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);// burda bu sayi degistirilemez sabittir
        //  Integer.MIN_VALUE =3 ;// Constand data


        try {
          //  System.out.println(10/2);
            System.out.println(10/0);
            System.out.println("bolmenin sonrasindaki satir");
        } catch (Exception e) {

            System.out.println("catch blogundaki satir");

        }finally {
            System.out.println("finaly blogundaki satir");
        }



    }
}
