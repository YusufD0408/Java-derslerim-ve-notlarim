package day06_concatenation_matematikselOperatorler;

public class C01_Concatenation {
    public static void main(String[] args) {
        String s1= "Java";
        String s2="Candir";
        String s3= " ";
        String s4= "";
        int a = 3;
        int b =5;
        /*
        sadece yukarda varuableleri kullnarak asagida
        verilen metinleri yazdirin
         */
       // Java35
        System.out.println(s1+a+b);

        //Java15
        System.out.println(s1+(a*b)); // s1+a*b olur parantez almasakda olur islem onceligi var

        //8Candir
        System.out.println(a+b+s2);

        // 53Java
        System.out.println(b+(a+s1));
        System.out.println(s4+b+a+s1);

        //Java 35
        System.out.println(s1+s3+a+b);

        //35 Java
        System.out.println(a+s4+b+s3+s1);

    }
}
