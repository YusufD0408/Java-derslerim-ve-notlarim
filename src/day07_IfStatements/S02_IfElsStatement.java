package day07_IfStatements;

import java.util.Scanner;

public class S02_IfElsStatement {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        // kucukse “Maalesef kaldin” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double girilenNot = scan.nextDouble();
        if (girilenNot>=50 ){
            System.out.println("Sinifi gectin");
        }else {
            System.out.println("Malesef kaldin");
        }
    }
}
