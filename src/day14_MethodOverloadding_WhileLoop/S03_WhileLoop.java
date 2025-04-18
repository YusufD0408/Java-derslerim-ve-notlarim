package day14_MethodOverloadding_WhileLoop;

import java.util.Scanner;

public class S03_WhileLoop {
    public static void main(String[] args) {
        // Soru 3- While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        // donduren bir method olusturun.

        System.out.println(tersMetin("yusuf"));
        System.out.println(terssMetin("yusuf"));
        terrsMetin("Yusuf");
        TersMetin("merve");
    }
    public static String tersMetin(String metin){
        String tersmetin ="";
        int index =metin.length()-1;
        while (index>=0){
            tersmetin+=metin.charAt(index);
            index--;

        }
        return tersmetin;
    }
    public static String terssMetin(String metin){
        String terssMetin ="";
        for (int i = metin.length()-1; i >=0 ; i--) {
            terssMetin+=metin.charAt(i);

        }
        return terssMetin;
    }
    public static void terrsMetin(String metin){
        String terrsmetin ="";
        int index = metin.length()-1;
        while (index>=0){
            terrsmetin+=metin.charAt(index);
            index--;
        }
        System.out.println(terrsmetin);
    }
    public static void TersMetin(String metin){
        String tersMetin ="";
        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin+=metin.charAt(i);

        }
        System.out.println(tersMetin);
    }




}
