package day09_Swich_StringManipulation;

import java.util.Scanner;

public class S05_Swich {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gun numarasini giriniz");
        int no = scan.nextInt();
        switch (no){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Haatali giris");
        }
    }
}
