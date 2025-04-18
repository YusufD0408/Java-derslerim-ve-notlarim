package day11_stringManipulation_ForLoop;

public class C01_isEmpty_IsBlank {
    public static void main(String[] args) {
        String str = "Java candir";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        str =" ";
        System.out.println(str.isBlank());
        System.out.println(str.length());
        str="";
        System.out.println(str.length());
        System.out.println(str.isBlank());

    }
}
