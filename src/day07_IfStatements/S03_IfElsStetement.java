package day07_IfStatements;

import java.util.Scanner;

public class S03_IfElsStetement {
    public static void main(String[] args) {
        //  Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //  yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        int girilenYas= scan.nextInt();
        if (girilenYas>=60){
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.println("Emekli olabilmeniz icin daha "+(65-girilenYas)+" yil calismaniz gerekir");
        }
    }
}
