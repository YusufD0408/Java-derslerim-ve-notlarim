package day34_AbstracktClass;

public abstract class EBalik extends AHayvan{

    public void hareket(){
        System.out.println("Baliklaar yuzer");
    }

    public void solunum(){
        System.out.println("Baliklar solungac solunumu yapar");
    }
    public void cogalma(){
        System.out.println("Baliklar yumurta ile cogalirlar");
    }
    public abstract void yuzgec();

    public abstract void yasamAlani();
    public abstract void IskeletYapisi();

}
