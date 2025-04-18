package day04_dataCasting_wrapperClass;

import java.util.Scanner;

public class C04_CharCasting {
    public static void main(String[] args) {
        // kullanicidan bir char isteyin. girilen char'dan sonraki uc degeri yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char input =scan.next().charAt(0);
        System.out.println("Girilen karakterden sonraki uc karaker : "+(char)(input+1)+","+(char)(input+2)+","+
                (char)(input+3));
    }
}
