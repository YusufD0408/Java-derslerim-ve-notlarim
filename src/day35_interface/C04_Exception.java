package day35_interface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exception {
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=5;
        System.out.println(sayi1/sayi2);

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi3 = 0;
        try {
            sayi3 = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("sana tam sayi yaz dedik kardas");
        }
        if (sayi3==0){
            System.out.println("sifir giremezsiniz");
        }else {
            System.out.println(sayi1/sayi1);

        }




    }

}
