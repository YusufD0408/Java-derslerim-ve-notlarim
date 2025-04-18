package day34_AbstracktClass;

public class FTatliSuBaliklari extends EBalik{
    @Override
    public void beslenme() {

    }

    @Override
    public void omur() {

    }

    @Override
    public void yuzgec() {

    }

    @Override
    public void yasamAlani() {

    }

    @Override
    public void IskeletYapisi() {

    }

    public static void main(String[] args) {
        FTatliSuBaliklari sazan =new FTatliSuBaliklari();

        EBalik alabalik =new FTatliSuBaliklari();

       AHayvan yayin =new FTatliSuBaliklari();
       /*
       Abstract class'larin constract'irlari vardir ama obje
       olusturulamaz

       Abstrack class'lar data türü secilip concrete child
       class'larin constructor'lari kullanarak
       Abstract parent clasdaki özeliktelerinde objeler olusturulabilir

        */

    }


}
