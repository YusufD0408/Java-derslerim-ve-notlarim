package day11_stringManipulation_ForLoop;

import java.util.Scanner;

public class S01_StringManipulation {
    public static void main(String[] args) {
        //  Soru 1 : Kullanicidan bir cumle alin
        //- cumlede ev geciyorsa, "home home sweet home" yazdirin
        //- cumlede is geciyorsa, "calismak guzeldir"
        //- ikisini de iceriyorsa ""Hem ev lazim hem is"
        //- hicbirini icermiyorsa "cok calisman lazim" yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cumle giriniz");
        String cumle = scan.nextLine();
        cumle=cumle.toLowerCase();

        if (cumle.contains("ev")&&cumle.contains("is")) {
            System.out.println("\"Hem ev lazim hem is");
        } else if (cumle.contains("ev")){
            System.out.println("home home sweet home");
        } else if (cumle.contains("is")) {
            System.out.println("calismak guzeldir");

        }else {
            System.out.println("cok calisman lazim");
        }
    }
}
