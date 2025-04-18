package day09_Swich_StringManipulation;

public class C03_concat {
    public static void main(String[] args) {
        String str1="Java";
        String str2= "Candir";
        String str3=" ";
        System.out.println(str1+str3+str2);
        System.out.println(str1.concat(str3).concat(str2));

    }
}
