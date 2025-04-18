package day09_Swich_StringManipulation;

public class C06_substring {
    public static void main(String[] args) {
        String str ="Java ne kadar güzel";
        System.out.println(str.substring(8));
        System.out.println(str.substring(0));
        System.out.println(str.substring(str.length() - 3));
        System.out.println(str.substring(str.length()));
        System.out.println(str.substring(5, 7));
        System.out.println(str.substring(3, 4));
        System.out.println(str.substring(2, 2));

    }

}
