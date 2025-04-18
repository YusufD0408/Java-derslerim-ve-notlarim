package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        /*
        Kullanicidan ismini, soyismini,ve yasini alip,asagidaki formatta yazdirin
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz :44
        Kaydiniz basariyla tamamlanmistir
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String name = scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String surname = scan.nextLine();
        System.out.println("Lütfen yasinizi giriniz");
        String age = scan.nextLine();
        System.out.println(" Isminiz  : "+name+
                       "\n Soyadiniz: "+surname+
                         "\n Yasiniz  : "+age+
                "\nKaydiniz basariyla tamamlanmistir");

    }
}
