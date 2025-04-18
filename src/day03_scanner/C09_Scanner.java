package day03_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String name = scan.nextLine();
        System.out.println("Lütfen soyadinizi giriniz");
        String surname = scan.nextLine();
        System.out.println("Lütfen yasinizi giriniz");
        String age = scan.nextLine();
        System.out.println("Girilen bilgiler : "+name.toUpperCase().charAt(0)+" "+surname.substring(0,1).toUpperCase()+
                surname.substring(1).toLowerCase()+","+age);

    }
}
