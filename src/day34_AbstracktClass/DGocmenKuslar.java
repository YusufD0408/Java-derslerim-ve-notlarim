package day34_AbstracktClass;

public class DGocmenKuslar extends BKuslar{
    /*
    sadece ayrimi belirtmek icin abstrack olayan class'lara
    CONCRETEClasss denir
    1- abstrack bir class parent'i olan abrastrack class'daki
    abstrack medhod'lari implement etmek zorunda degildir
    isterse implemed edip badili hale getirir isterse yok sayar+
    2- abstract bir silsileden sonra gelen ilk concrete class
    parent veya grandparent olan abstract class'larda concrete
    yapilmayan tüm abstract class'lari IMPLEMENT ETMEK ZORUNDAIR

     */

    @Override
    public void hareket() {

    }

    @Override
    public void beslenme() {

    }

    @Override
    public void omur() {

    }
}
