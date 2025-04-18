package day10_StringManipulation;

public class C06_lastIndeksOf {
    public static void main(String[] args) {
        String str = "Java bazen beyin yakar";
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.lastIndexOf("a", 19));
         /*
        verılen bır cumlede , istenen bir string icin asagidaki cumlelerden uygun olani yazdirin
        1 aradiginiz kelime cumlede 1 kere kullanilmis
        2 aradiginiz kelime cumlede 1'den fazla kullanilmis
        3 aradiginiz kelime cumlede kullanilmamistir
         */
        String cumle ="Yasasin java, iyiki java ogreniyorum";
        String kelime ="java";
        int IlkKelimeIndex = cumle.indexOf(kelime);
        int lastIndex =cumle.lastIndexOf(kelime);
        if (IlkKelimeIndex==-1){
            System.out.println("aradiginiz kelime cumlede kullanilmamistir");
        } else if (IlkKelimeIndex==lastIndex) {
            System.out.println("aradiginiz kelime cumlede 1 kere kullanilmistir");

        }else {
            System.out.println("aradiginiz kelime cumlede birden fazla kullanilmistir");
        }


    }
}

