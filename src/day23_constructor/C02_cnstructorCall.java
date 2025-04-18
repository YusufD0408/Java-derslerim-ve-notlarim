package day23_constructor;

public class C02_cnstructorCall {
    int sayi;
    String str;



    public C02_cnstructorCall() {
        System.out.println("Parametresiz cons calistir");
    }

    public C02_cnstructorCall(int sayi) {

        System.out.println("int Parametreli cons calistir");
        this.sayi = sayi;

    }

    public C02_cnstructorCall(String str) {
        this(5);
        System.out.println("String Parametreli cons calistir");
        this.str = str;
    }

    public C02_cnstructorCall(int sayi, String str) {
        this();
        this.sayi = sayi;
        this.str = "Java";
        System.out.println("2 Parametreli cons calistir");
    }

    public static void main(String[] args) {
       //C02_cnstructorCall obj1 =new C02_cnstructorCall();
        //C02_cnstructorCall obj2 =new C02_cnstructorCall("Java");
        //System.out.println(obj2.sayi);
       // System.out.println(obj2.str);
        C02_cnstructorCall obj3 =new C02_cnstructorCall(7,"selcuk");
        System.out.println(obj3.sayi);
        System.out.println(obj3.str);
    }
}
