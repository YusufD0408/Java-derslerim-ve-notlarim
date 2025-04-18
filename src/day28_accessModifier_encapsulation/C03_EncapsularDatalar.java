package day28_accessModifier_encapsulation;

public class C03_EncapsularDatalar {

       static private String isim = "Yildiz Pazarlama";

        private int  satisTutari ;

       private int  tolamSatis;

        public int a;

    public int getTolamSatis() {
        return tolamSatis;
    }

    public static String getIsim() {
        return isim;
    }

    public int toplamSatis ;

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        tolamSatis+=satisTutari;
    }
}
