package day11_stringManipulation_ForLoop;

public class C03_replace {
    public static void main(String[] args) {
        String str ="Java Candir";
        System.out.println(str.replace("J", "H"));
        System.out.println(str.replace("a", ""));
        System.out.println(str.replace("Java", "x"));
        System.out.println(str.replace("va", "lala"));
        str=str.replace(" ","");
        System.out.println(str);
        System.out.println(str.replaceFirst("a", ""));

    }
}
