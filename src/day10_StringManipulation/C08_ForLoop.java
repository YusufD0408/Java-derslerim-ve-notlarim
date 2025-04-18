package day10_StringManipulation;

public class C08_ForLoop {
    public static void main(String[] args) {
        // 50 den baslayip 100 kadar 100 dahil sayilari yan yana aralarinda bir bosluk olacak sekilde yazdirin
        for (int i =50; i <=100 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
        // uc basamakli sayilardan 23 ile bolunebilenleri yan yana aralarinda bir bosluk birakarak yazdiralim
        for (int i =100; i <=999 ; i++) {
            if (i%23==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        // 20 den baslayip 7 ser artarak 100 kadar yazdrin
        for (int i =20; i <=100 ; i+=7) {
            System.out.print(i+" ");
        }
        System.out.println("");
        // 100 den baslayarak 1 kadar sinirlar dahl 7 ile bolune bilen sayilari yazdirin
        for (int i = 100; i >=1 ; i--) {
            if (i%7==0){
                System.out.print(i+" ");

            }

        }
    }
}
