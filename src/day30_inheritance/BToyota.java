package day30_inheritance;

public class BToyota extends Araba {
    String marka="Toyota";
    String aku ="Inci aku";
    String lastikler ="Bridgeston";

    public void motor(){
        System.out.println("Toyotalar cevreci toyota motorlar kullanir");
    }

    public void gunenlik(){
        System.out.println("Toyota araclar extra guvenlik önlemleri barindir");
    }


}
