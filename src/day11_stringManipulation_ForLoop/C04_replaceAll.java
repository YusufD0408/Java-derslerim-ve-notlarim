package day11_stringManipulation_ForLoop;

public class C04_replaceAll {
    public static void main(String[] args) {
        String str = "   J1a23va34 5C54and51ir87   ";
        // sayilari metodla temizleyin

        //Regex (Regular Expressions)
        // \\s : space          \\S : space olmayan hersey
        //  \\s+ : yanyana birden fazla space
        //   \\d : digits          \\D : digit olmayan hersey
        //    \\w : harf veya rakam \\W : harf veya rakam olmayan hersey
        str=str.trim();
        str =str.replaceAll("\\d","");
        System.out.println(str);
    }
}
