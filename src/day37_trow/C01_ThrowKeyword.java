package day37_trow;

import java.util.Scanner;

public class C01_ThrowKeyword {


   /*

Kodlari yazarken bazen muhtemel bir durunda bazi kodlarin ignore edilmesi istenebilir

bu durumda kodlari IGNORE etme yontemi olarak İsteyerek exception firlotip

sonra da calismasini istediginiz yerde catch ile yokoloyip yolumuza devam edebiliriz

*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen yaşınızı giriniz: ");

        int yas = scan.nextInt();

        if (yas < 0) {


            throw new IllegalArgumentException("Yaş negati olamaz");

        }
    }
}