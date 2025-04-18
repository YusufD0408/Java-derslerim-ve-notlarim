package day14_MethodOverloadding_WhileLoop;

public class S01_WhileLoop {
    public static void main(String[] args) {
        // Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
        // yazdirin
        int sayi =10;
        int top =0;
        int sayiAdedi=0;
        while (sayi<100){
            top+=sayi;
            sayi++;
            sayiAdedi++;
        }
        System.out.println(sayiAdedi+" adet sayinin toplami "+top);
    }
}
