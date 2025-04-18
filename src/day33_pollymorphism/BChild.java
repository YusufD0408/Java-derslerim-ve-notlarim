package day33_pollymorphism;

public class BChild extends AParent{
    @Override
    void method1() {
        super.method1();
        // burada super. olursa hem child cllas'daki method1
        // hemde super cllas'daki method1 calisir
    }

    void method2(){
        // bir method override edildiginde child class'da notasyonu
        //kullanilabilir
        // kullanmak veya kullanmamak arasinda pratikte söyle bir sonuc olusur

        // eger notasyon kullanirsa iki method arasindaki iliski takip edilir
        // parent class'daki methot silinirse notasyon cte verir
        // notasyon yoksa parent classdaki overriden method silinirse bir uyari verilmez .CTE olusmaz



    }
    Integer method3(){
        // overridden methot ile overridening isim ve signuture
        // ayni olmalidir
        // return type ve access modifier
        // signiture dahil degildir
        //ancak overridingde bunlala ilgili de kurallar vardir
       // 1 access modifier kurali:
        // child parent'i kisitlayamaz


        return 5;
    }

}