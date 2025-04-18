package day36_exception;

public class C07_ExceptionTurleri {
    public static void main(String[] args) {
        String str =null;
        System.out.println(str);
       // System.out.println(str.concat("Java"));

        String str1 ="34";
        String str2 = "23a";
      //  System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));

        String str4 = "Java Candir";
      //  Integer a =str4; kabul etmez
        Object obj =str4;  // kabul eder cünkü baba

        Integer a = (Integer) obj;  // ClassCastException


    }
}
