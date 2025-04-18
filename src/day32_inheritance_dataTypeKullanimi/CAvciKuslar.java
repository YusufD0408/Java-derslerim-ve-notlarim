package day32_inheritance_dataTypeKullanimi;

public class CAvciKuslar extends BKuslar {

   String  hareket= "ucarlar";
   String beslenme= "et yerler";
   String pence= "pencelidir";
   String  gaga= "sivri gagali";



    public static void main(String[] args) {
        CAvciKuslar kartalAvci = new CAvciKuslar();
        System.out.println(kartalAvci.hareket);
        System.out.println(kartalAvci.beslenme);
        System.out.println(kartalAvci.pence);
        System.out.println(kartalAvci.gaga);


        System.out.println(kartalAvci.kanat);
        System.out.println(kartalAvci.solunum);
        System.out.println(kartalAvci.cogalma);

        System.out.println(kartalAvci.omur);


        BKuslar kartalKus =new CAvciKuslar();
        System.out.println(kartalKus.hareket);
        System.out.println(kartalKus.beslenme);
      //   System.out.println(kartalKus.pence);
        System.out.println(kartalKus.gaga);


        System.out.println(kartalKus.kanat);
        System.out.println(kartalKus.solunum);
        System.out.println(kartalKus.cogalma);

        System.out.println(kartalAvci.omur);

        AHayvanlar kartalHayvan=new CAvciKuslar();

        System.out.println(kartalHayvan.hareket);
        System.out.println(kartalHayvan.beslenme);
       //    System.out.println(kartalHayvan.pence);
       // System.out.println(kartalHayvan.gaga);


       // System.out.println(kartalHayvan.kanat);
        System.out.println(kartalHayvan.solunum);
        System.out.println(kartalHayvan.cogalma);

        System.out.println(kartalAvci.omur);


        /*
        Eger bir obje olusturulurken data türü ve constructor
        ayni ise Aradigimiz özellikler icin direk o cllasa gider
        ve özellikleri arariz

        Eger data türü ve constructur farkli ise variable ve methodlar
        farli davranirlar

        variableler önce data türünün oldugu clasa bakar
        o variableyi bulursa degerini yazdirir
        bulamazsa data turunun parentlerine bakar
        orada da bulamazsa cte verr

        Bir özelligi variable olarak olusturursaniz data türü
        olan class ve parentlerdeki ortak özellikleri alir




         */



    }










}
