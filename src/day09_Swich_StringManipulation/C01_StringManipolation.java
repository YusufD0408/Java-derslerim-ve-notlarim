package day09_Swich_StringManipulation;

import java.util.Locale;

public class C01_StringManipolation {
    public static void main(String[] args) {
        String str = "Java Candir";
        System.out.println(str.toUpperCase());
        // Strin manipolation bir variable'ye atanmazsa asil variable degismez
        System.out.println(str);
        str =str.toUpperCase();
        str=str.toLowerCase(Locale.forLanguageTag("TR"));


    }
}
