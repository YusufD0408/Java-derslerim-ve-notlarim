package day25_passByValue_immutableClasses;

public class C04_StringHavuzu {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Java";
        String str3= new String("Java");
        String str4= "Ja"+"va";
        String s ="Ja";
        String t ="va";
        String str5 =s.concat(t);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str5));

        System.out.println("***********");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str1==str5);

        /*
        == hem referansi hemde degeri karsilastirir
        equals() ise sadece degerleri karsilastirir

        eger string havuzunda olup hem referansi hemdegeri ayni olan stringler ===
        ile kasilastirilirsa sonuc true
        equels ile karsilasirilirsa false olur
         */
    }
}
