package day17_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_kullanicidanDegeralarakArryOlustur {
    public static void main(String[] args) {
        // kullanicidan array olusturmak uzere pozitif tamsayilar alin
        // kullaniciya islemin bitmesi ici sifira basmasini isteyin
        // bir onceki class'dan method kullanarak aldiginiz elementi arr'ye ekleyin
        Scanner scan = new Scanner(System.in);
        int girilenSayi=1;
        int[] arr =new int[0];
       while (girilenSayi!=0){
           System.out.println("Lütfen array'e eklemek icin pozitif tamsayilar giriniz ve " +
                   "islemi bitirmek icin sifira basin");
           girilenSayi=scan.nextInt();
           if (girilenSayi!=0){
              arr= C04_ArrayeElemanEklemeMethodu.elementEkleme(arr,girilenSayi);
           }
       }
        System.out.println(Arrays.toString(arr));
    }
}
