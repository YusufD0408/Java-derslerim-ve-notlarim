package day05_Matematiksellslemle_Increament;

public class C01_MatematikselIslemler {
    public static void main(String[] args) {
        int a = 27;
        int b = 4;
        System.out.println(a/b);// 6     6,75  sonuc   her ikiside int sonuc int

        double c=27;
        System.out.println(c/b); // biri double biri int java daha buyuk olan variableye gore hareket eder

        System.out.println(2567/10);   //256 variableyi belitmedigimiz icin ikisinide int olarak alir
        System.out.println(2567%10); // 7 macilis bolmede kalana esit

        double sonuc = (double)(a/b);
        System.out.println(sonuc);


        double sonuc1 = (double)a/b; // a ' doubleye cevirdi sonuc 6,75
        System.out.println(sonuc);
    }
}
