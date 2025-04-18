package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen cemberin yaricapini giriniz");
        double yaricap = scan.nextDouble();
        System.out.println("Cemberin alani = "+(3.14*yaricap*yaricap)+
                       "\nCemberin cevresi = "+2*3.14*yaricap);
    }
}
