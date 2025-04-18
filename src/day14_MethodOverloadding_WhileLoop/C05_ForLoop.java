package day14_MethodOverloadding_WhileLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        // 50 ve 100 arasindaki sayilari toplayin
        // sinirlar dahil
        // baslangic ve bitis degeri belli olab veya kac kere
        // tekrar edilecegi bilinen looplara for loop ideal larak kullanilabilir
        int toplam = 0;
        for (int i = 50; i <= 100; i++) {
            toplam += i;

        }
        System.out.println("toplam = "+toplam);
        System.out.println("***********************");
        toplam=0;
        int sayi =50;
        while (sayi<=100){
            toplam+=sayi;
            sayi++;
        }
        System.out.println("While ile toplam = "+toplam);
    }
}
