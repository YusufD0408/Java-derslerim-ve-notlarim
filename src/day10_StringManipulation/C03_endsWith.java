package day10_StringManipulation;

import java.util.Scanner;

public class C03_endsWith {
    public static void main(String[] args) {
        String str = "Java harika";
        System.out.println(str.endsWith("ika"));
        System.out.println(str.endsWith(str.substring(str.length() - 1)));

        // kullanicidan bir mail aln
        //mail @ icermiyorsa "gecersiz mail"
        //mail @gmail.com icermiyrsa " mail gmail olmali"
        //mail @gmail.com ile bitmiyorsa "mailde yazim hatasi var"
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir mail giriniz");
        String mail = scan.nextLine();
        if (!mail.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");

        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");

        }
    }
}
