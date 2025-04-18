package day26_lokalTime_varargs;

import java.util.Arrays;

public class C05_Varargs {
    public static void main(String[] args) {
        topla(3,4);
        topla(3,4,5);
        topla(3,4,5,6);
        topla(1,2,3,4,5,6,8,9);
    }
    public static void topla(int... a){
        System.out.println(Arrays.toString(a));
       int top =0;
        for (int each:a
        ) {
            top+=each;
        }
        System.out.println("Toplam :"+top);
    }
    /*
    Javada bir method parametrelerine uygun argumentlerine sahip method kol oldugunda calisir
    orng 2 int parametre varsa sadece iki int argument ile methd kl yapiliginda calisir java ayn
     data turune sahip olma sartiyla parametre sayisini esnek tutmak icin Varaags lusturmustur

     Varargs bir Array'dir.
     dolaysiyla method'da Array elementlerini istedigimiz isleme uygun olarak kullanabiliriz
     */
}
