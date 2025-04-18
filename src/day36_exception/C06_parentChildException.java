package day36_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_parentChildException {
    public static void main(String[] args) {

        String dosyaYolu = "src/day36_exception/text.txt";

        FileInputStream fis = null;

        try {

        fis = new FileInputStream(dosyaYolu);

        int k=0;

        while((k= fis.read()) != (-1)) {

            System.out.print((char) k);

        }

    } catch (FileNotFoundException e) {



    } catch (IOException e) {



        }
        /*
        Eger kodumuzda birden fazla exception ihtimali varsa ve bu exceptionlar
        arasinda parend-child iliskisi varsa
        1   ya sadece parent'i yazariz cünkü parent exception, child exceptionlari kapsar
        2- yada ikisini de yazmak istiyorsak once child exception'i sonra parent exception'u yazmaliyiz.



         */


     }


}



