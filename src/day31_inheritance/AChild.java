package day31_inheritance;

import day30_inheritance.GParent;

public class AChild extends GParent  {
   String childStr;
    AChild(){
        System.out.println("Child class constructor calisti");
    }

    public static void main(String[] args) {
        //System.out.println(childStr); static olmadigi icin kullanamayiz
       // System.out.println(sayiParent); static olmadigi icin kullanamayiz
       // System.out.println(sayiGrandparent);static olmadigi icin kullanamayiz
        AChild objChild = new AChild();



        /*
        Jvada inheritance kullanirken child cllastaki obje parent classlardaki tum özelliklere sahip olur bunu super
         consructor ile yapar
        extens keyword kullanan bir classda olusturulan her bir constructor'in ilk satiri
        biz görmezsek bile super() vardir
        suoer() önce parent class'a gidip oradaki constructor
        calistirir
        bu sekilde Child class daki constructor calistiginda exdens
        keyword kullanamayan parent buluncaya kadar parent classlara gider

         */
    }

}
