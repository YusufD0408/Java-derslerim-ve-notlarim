package day27_stringBuilder;

import java.util.Scanner;

public class C05_strinBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java Candir");


        System.out.println(sb1.delete(4, 5));
        System.out.println(sb1);


        System.out.println(sb1.deleteCharAt(9));
        System.out.println(sb1);

        System.out.println(sb1.insert(9, "r"));
        System.out.println(sb1);

        System.out.println(sb1.insert(4, " "));

        String str =" can bize gelecek";
        sb1.insert(11, str, 0, 5);
        System.out.println(sb1);

        sb1.replace(12,15,"Can");
        System.out.println(sb1);



    }

}
