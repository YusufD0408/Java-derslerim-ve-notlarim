package day10_StringManipulation;

public class C04_indeksOf {
    public static void main(String[] args) {
        String str = "Java cok ama cok güzel";
        System.out.println(str.indexOf("c"));

        /*
        verılen bır cumlede , istenen bir string icin asagidaki cumlelerden uygun olani yazdirin
        1 aradiginiz kelime cumlede 1 kere kullanilmis
        2 aradiginiz kelime cumlede 2 kere kullanilmis
        3 aradiginiz kelime cumlede 2 'den fazla kullanilmis
        4 aradiginiz kelime cumlede kullanilmamistir
         */
        String cumle ="Yasasin java, iyiki java ogreniyorum";
        String kelime ="java";
        if (cumle.indexOf(kelime)==-1){
            System.out.println("Aradiginiz kelime cumlede kullanilmamistir");
        } else {
            int kelimeIlkIndeksi =cumle.indexOf(kelime);
            if (cumle.indexOf(kelime,(kelimeIlkIndeksi+1))==-1){
                System.out.println("aradiginiz kelime cumlede 1 kere kullanilmistir");

            }else {
                int ikinciKelimeIndeks =cumle.indexOf(kelime,(kelimeIlkIndeksi+1));
                if (cumle.indexOf(kelime,(ikinciKelimeIndeks+1))==(-1)){
                    System.out.println("aradiginiz kelime cumlede 2 kere kullanilmistir");
                }else {
                    System.out.println("aradiginiz kelime cumlede 2'den fazla kullanilmistir ");
                }
            }

        }
    }
}
