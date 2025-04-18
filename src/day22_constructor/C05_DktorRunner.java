package day22_constructor;

public class C05_DktorRunner {
    public static void main(String[] args) {
        C04_Doktor doktor1 =new C04_Doktor();
        doktor1.isim="Kemal";
        doktor1.yas=40;
        System.out.println(doktor1.soyisim);
        System.out.println(doktor1.yas);



        C04_Doktor doktor2 =new C04_Doktor();


        C04_Doktor doktor3;
        // doktor3.yas
        // Constructor calismaadan bir bje olusturup deger atamasi mumkum degildir
        System.out.println("Variableye atanmayan obje icin yas "+new C04_Doktor().yas);
    }
}
