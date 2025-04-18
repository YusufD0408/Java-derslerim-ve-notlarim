package day04_dataCasting_wrapperClass;

public class C05_WrapperClasses {
    public static void main(String[] args) {
        // java primitive data turleri icin hazir metod olusturamaz
        // ancak  primitive data turlerinide kullanabilecek wrapper class lar olusturmustur
        // int Integer
        // char Character
        // short Short
        // double Double like any that

        int sayi2 = 5;
        Integer sayi3 =sayi2;
       int sayi4 = sayi3;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        // wrapper claslarda casting kullanilmaz
        // icinde sadece sayisal ifadeler bulunan bir string verildiginde matematiksel
        // islem yapilmasi istendiginde Integar.parsInt() ile int'e cevrilebilir.
        String str1 ="22";
        String str2 = "33";
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));
        char ch1 ='7';
        System.out.println(Character.isDigit(ch1));
        System.out.println(Character.isLetter(ch1));
        System.out.println(Character.isWhitespace(ch1));
    }
}
