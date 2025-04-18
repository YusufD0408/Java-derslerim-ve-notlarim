package day09_Swich_StringManipulation;

public class C02_equals {
    public static void main(String[] args) {
        String str1= "Java";
        String str2="JAVA";
        String str3="java";
        String str4="JaVa";
        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str2));
        String str5 ="Java";
        String str6 ="Ja";
        String str7 ="va";
        String str8= str6.concat(str7);
        System.out.println(str8);
        System.out.println(str1==str5);
        System.out.println(str1==str8);
    }
}
