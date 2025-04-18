package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class S05_IfElsestatement {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
        //“Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        //gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
        //zamani” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gun ismi giriniz");
        String day = scan.next();

        if (day.equalsIgnoreCase("pazartesi")){
            System.out.println("Simdi calisma zamani tatile 5 gun var");
        } else if (day.equalsIgnoreCase("sali")){
                System.out.println("Simdi calisma zamani tatile 4 gun var");
        }else if (day.equalsIgnoreCase("carsamba")){
            System.out.println("Simdi calisma zamani tatile 3 gun var");
        }else if (day.equalsIgnoreCase("persembe")){
            System.out.println("Simdi calisma zamani tatile 2 gun var");
        }else if (day.equalsIgnoreCase("cuma")){
            System.out.println("Simdi calisma zamani tatile 1 gun var");
        }else if (day.equalsIgnoreCase("cumartesi")){
            System.out.println("Simdi dinlenme zamani");
        }else if (day.equalsIgnoreCase("pazar")){
            System.out.println("Simdi dinlenme zamani");
        }else {
            System.out.println("Hatali giris lütfen tekrar deneyiniz");
        }

    }
}
