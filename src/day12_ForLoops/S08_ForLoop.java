package day12_ForLoops;

import java.util.Scanner;

public class S08_ForLoop {
    public static void main(String[] args) {
        //   Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
        //   tamsayilari yazdirin, sira
        //   - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        //   - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        //   - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
        //     yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {

            if (i%15==0){
                System.out.print("fizzBuzz ");
            } else if (i%3==0) {
                System.out.print("fizz ");
            } else if (i%5==0) {
                System.out.print("buzz ");
            }else {
                System.out.print(i+" ");
            }

        }
    }
}
