package day13_MethodOlusturma;

public class C05_StringiTerseCevirme {
    public static void main(String[] args) {
        // verilen bir stringi tersine cevirip bize donduren bir method olusturun
        System.out.println(stringiTersineCevir("yusuf"));

    }
    public static String stringiTersineCevir(String metin){
        String tersMetin="";
        for (int i =metin.length()-1; i>=0; i--) {
            tersMetin+= metin.charAt(i);

        }
        return tersMetin;
    }
}
