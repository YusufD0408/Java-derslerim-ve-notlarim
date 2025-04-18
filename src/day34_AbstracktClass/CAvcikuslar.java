package day34_AbstracktClass;

public class CAvcikuslar extends BKuslar{


    public void hareket() {

        System.out.println("ucarlar");
    }

    public void beslenme() {

        System.out.println("et yerler");
    }

    @Override
    public void omur() {
        System.out.println("Avci kuslar ortalama 10 yil yasar");
    }

    public void pence() {
        System.out.println("pencelidir");
    }

    public void gaga() {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {
        CAvcikuslar kartal =new CAvcikuslar();
        CAvcikuslar sahin =new CAvcikuslar();
     // BKuslar kus = new BKuslar
        // obje olusturulamaz cunku abstrack

        AHayvan baykus = new CAvcikuslar();
        baykus.hareket();
        baykus.solunum();
        baykus.omur();
    }

}
