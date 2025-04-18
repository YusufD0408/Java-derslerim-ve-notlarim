package day20_arrayLists;

public class C05_baskaclassdaKullanma {
    public static void main(String[] args) {
        // verilen sayinin pozitif tam bolenleri sayisi 10'dan cok ise 'Guzel'
        // yoksa 'Kotu' yazdirin
        int sayi =3000;
          int tamTolenlerSayi=S06_ArrayList.pozitifBolenleriniListele(sayi).size();
          if (tamTolenlerSayi>=10){
              System.out.println("Guzel");
          }else {
              System.out.println("Kotu");
          }
    }
}

