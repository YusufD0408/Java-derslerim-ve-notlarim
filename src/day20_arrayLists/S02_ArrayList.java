package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S02_ArrayList {
    public static void main(String[] args) {
        //   Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        //           liste olarak dondurecek bir method olusturun.

        /* Scanner scan = new Scanner(System.in);
        List<String> isimler = new ArrayList<>();
        String girilenIsim="";
        do {
            System.out.println("Lütfen listeye eklemek istediginiz isimleri giriniz bitirmek icin 'q' basin");
            girilenIsim=scan.nextLine();
            if (!girilenIsim.equalsIgnoreCase("q")){
                isimler.add(girilenIsim);
            }

        }while (!girilenIsim.equalsIgnoreCase("q"));
        System.out.println(isimler);
         */

        System.out.println(isimler());
    }
    public static List<String> isimler(){
        Scanner scan = new Scanner(System.in);
        List<String> isimler = new ArrayList<>();
        String girilenIsim="";
        do {
            System.out.println("Lütfen listeye eklemek istediginiz isimleri giriniz bitirmek icin 'q' basin");
            girilenIsim=scan.nextLine();
            if (!girilenIsim.equalsIgnoreCase("q")){
                isimler.add(girilenIsim);
            }

        }while (!girilenIsim.equalsIgnoreCase("q"));
        return isimler;
    }

}
