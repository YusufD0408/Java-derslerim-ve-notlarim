package day36_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Checked Exceptions kod yazilir yazilmaz daha run etmeden
        javanin riskli kodlari tanimlayip
        calistirmadan önce bana yol göstermelisin dedigi exception turleridir
         Checked Exception genelde dosya okuma ve yazma 10 islemlerinde olusur.
         IO exception olusma ihtimalina karsi kodu yazar yazmaz Java altini kirmizi cizer
         Checked exception kodun altini kirmizi cizdiginden kodunuzun calisir hale gelmesi icin
         kirmizi cizgiyi kaldirmamiz lazim

         1- try catch blogu kullanarak exception handle edilebilir ve javaya exception
         olustugunda ne yapmasini istedigimizi gösterebiliriz

         2- Eger exception'i handle etmek istemiyorsak
         sadece kodumuzun calismasini istiyorsak
         method deklarasyonuna bu exceptionn ihtimalini yazarak kodu calisir hale getirmeliyiz
         method signature'ina throws keyword'u ile beklenen exception turunu yazarsak
         kod calisir duruma gelir

        Ancak exception olusursa java'ya cozum yolu sunulmadiginda kodun calismasi durur
         */

        String dosyaYolu="src/day36_exception/text.txt";
        FileInputStream fis =new FileInputStream(dosyaYolu);


    }
}
