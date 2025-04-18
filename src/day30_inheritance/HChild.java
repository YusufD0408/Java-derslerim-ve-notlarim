package day30_inheritance;

public class HChild extends GParent {
    protected  int sayiChild;

    HChild(){
        System.out.println("Child class constructor'i calistir");
    }



    public static void main(String[] args) {
        HChild objChild =new HChild();
        System.out.println(objChild.sayiChild);
        System.out.println(objChild.sayiParent);
        System.out.println(objChild.sayiGrandparent);

        /*
        Child class'dan olusturdugumuz bor obje parent ve garndparent claslardaki
        tum  özeliklere sahip olur

        bir obje olusturuldugunda ilk dergerleri alabilmesi icin mutlaka bir constructor calismalidir

        Constructor call bizim kullandigimiz bir özellik degildir
        ancak inheritance 'i tam olarak anlayabilmek icin constructor call konusunu bilmemiz lazim

        Bu classda obje olusturmak icin HCild constructor'u kullandik
        ama objemiz parent ve grandparendaki özellikleride sahiplendi

        Peki bu nasil oldu?

        her ne kadar objeyi child cllasdan olustursakda bu objenin parent ve grandparend
        claslardaki özellikleri alabilmesi icin o claslardaki construcor larida calismak
        zorundadir
        java bu mecburi calismayi saglayabilmek icin cok özel bir sistem gelistitmistir
        bunun adi SUPER CONSTRUCTOR CALL'dur.



         */
    }
}
