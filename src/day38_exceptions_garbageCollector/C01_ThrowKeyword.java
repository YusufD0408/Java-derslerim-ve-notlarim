package day38_exceptions_garbageCollector;

import java.util.Scanner;

public class C01_ThrowKeyword {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen sifirdan büyük bir sayi girin");
        int sayi =scan.nextInt();

        try {
        if (sayi<0){
            throw new IllegalArgumentException("sayi negatif olmamali");

        }
        System.out.println("sartli calismak1");
        System.out.println("sartli calismak2");
        System.out.println("sartli calismak3");

        } catch (Exception e) {
            System.out.println(e.getMessage());
           // e.printStackTrace();


        }


        System.out.println("yola devam");

    }
}
