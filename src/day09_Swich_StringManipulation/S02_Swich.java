package day09_Swich_StringManipulation;

import java.util.Scanner;

public class S02_Swich {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
        int birler = sayi % 10;
        int onlar = sayi / 10;
        switch (onlar) {
            case 1:
                System.out.print("On");
                break;
            case 2:
                System.out.print("Yirmi");
                break;
            case 3:
                System.out.print("Otuz ");
                break;
            case 4:
                System.out.print("Kirk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Altmis");
                break;
            case 7:
                System.out.print("Yetmis");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");
                break;

        } switch (birler){
                case 1:
                    System.out.print("bir");
                    break;
                case 2:
                    System.out.print("iki");
                    break;
                case 3:
                    System.out.print("üc");
                    break;
                case 4:
                    System.out.print("dört");
                    break;
                case 5:
                    System.out.print("bes");
                    break;
                case 6:
                    System.out.print("alti");
                    break;
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                    break;

            }

        }

    }


