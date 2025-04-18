package day07_IfStatements;

import java.util.Scanner;

public class S05_Sorular {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        // kucukse “Maalesef kaldin” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double girilenNot =scan.nextDouble();
        if (girilenNot>=50 && girilenNot<=100){
            System.out.println("Sinifi gectin");
        }
        if (girilenNot<50){
            System.out.println("Malesef kaldin");
        }
    }

}
