package day26_lokalTime_varargs;

import java.time.LocalDate;
import java.util.Scanner;

public class C03_KimBuyuk {
    public static void main(String[] args) {
        // kullanicidan 2 farkli kisinin isim ve dogum tarihinin gun,ay
        // yilini alip kimin daha buyuk oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Ilk kisinin ismini girin");
        String isim1=scan.nextLine();
        System.out.println("Ikinci kisinin ismini giriniz");
        String isim2=scan.nextLine();
        System.out.println("Ilk kisinin dogum tarihini gun, ay yil olarak giriniz");
        int gun =scan.nextInt();
        int ay =scan.nextInt();
        int yil =scan.nextInt();
        LocalDate tarih1 =LocalDate.of(yil,ay,gun);
        System.out.println("Ikinci kisinin dogum tarihini gun, ay yil olarak giriniz");
         gun =scan.nextInt();
         ay =scan.nextInt();
         yil =scan.nextInt();
        LocalDate tarih2 =LocalDate.of(yil,ay,gun);
        System.out.println(tarih2.isAfter(tarih1)?
                "Buyuk olan "+isim1 :
                "Buyuk olan "+isim2
        );
    }
}
