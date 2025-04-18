package day35_interface;

import java.util.List;

public class C02_ChildofI01veI03 implements I01_Interface,I03_interface{
/*
interface'in EN ONEMLI ARTISI

bir class'in birden fazla interface'i implement edebilmesidir

bir class'i baska bir clasll'a extends edebiliriz
Ancak birden fazla interface'i implement ederken dikkat etmemiz gereken bir konu vardir

eger implement etmek istedigimiz forkli interface'lerde

ayni isimde fakat farkli return type'i olan method Lor varsa

iki method'u ayni anda implement edemeyeceginiz icin

o iki interface'den ancak birini implement edebiliriz




 */


    @Override
    public void toplama() {

    }

    @Override
    public void cikarma() {

    }

    @Override
    public String ekleme() {
        return null;
    }

    @Override
    public int faktoriyel() {
        return 0;
    }

    @Override
    public void bolme() {

    }

    public static void main(String[] args) {
        C02_ChildofI01veI03 obj =new C02_ChildofI01veI03();
        System.out.println(I01_Interface.str);
        System.out.println(I03_interface.str);


    }

}
