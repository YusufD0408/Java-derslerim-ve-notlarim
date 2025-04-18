package day27_stringBuilder;

public class C04_StringBuilderdeStringMethodlari {
    public static void main(String[] args) {

        // StringBuilder Class'inda olmayip String Class'inda olan methotlari kullanmak istersek  sb.toString()
        // sonra istediginiz String methodlari kullanabiliriz
        //  bu konuda DIKKAT etmemiz gereken konu String donduren methodlaridir
        //veya String Class'indan kullanacagimiz methodlar kalici degisiklik yapmaz




        StringBuilder sb1 = new StringBuilder("Java Candir");
        StringBuilder sb2 =new StringBuilder("Java candir");
        sb1.substring(5);


        System.out.println(sb1);// Java Candir

        //  sb1 =sb1.substring(start 5)

        System.out.println(sb1.compareTo(sb2));// -32

        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString()));

        sb1.substring(3,6);

        System.out.println(sb1);






    }
}
