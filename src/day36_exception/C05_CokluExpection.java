package day36_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_CokluExpection {
    public static void main(String[] args) {
        String str = "Java her gecen gun güzellesir";
        int[] arr ={3,4,6,3,6,7,4,2,5,7};
        // Kullanicidan 0 veya pozitif bir tam sayi isteyin
        // girilen degeri index olaarak kullanip
        // str ve arr'nin o index'deki elemanlari yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Index olarak kullanmak icin 0 veya pozitif bir tamsayi girin");
        /*
        Birbirinden bagimsiz 3 farkli turde exception riski var bunlari farkli sekillerlde
        hanle edebiliriz
        1-herbirini ayri ayri try catch yapariz
        2- tek bir try  birden fazla catch yapabiliriz
        3- tek bir try catch yapip tüm exceptionlari yakalayacak bir exception turu yapabiliriz
         */

        try {
            int index = scan.nextInt();

            System.out.println(str.charAt(index));

            System.out.println(arr[index]);
        } catch (Exception e) {
          //  System.out.println("Giris hatali olabilir , index String veya arr'in disinda olabilir");
       e.printStackTrace();
       // bir mesaj yazacaksak genel bir mesaj yazabilirir yada
            // javanin hata kodlarini yazdirabiliriz

        }


        try {
            int index = scan.nextInt();

            System.out.println(str.charAt(index));

            System.out.println(arr[index]);

        } catch (InputMismatchException e) {
            System.out.println("TAMSAYI GIRMELISIN");

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Girilen index String sinrlari disinda");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Girilen index Arry sinirlari disinda");
        }
    }
}
