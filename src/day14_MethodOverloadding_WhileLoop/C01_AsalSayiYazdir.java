package day14_MethodOverloadding_WhileLoop;

public class C01_AsalSayiYazdir {
    public static void main(String[] args) {
        // verilen pozitif bir tamsayinin asal sayi olup olmadigini yazdiran bir method olusturun
        asalsayiMiYazdir(7);
        asalsayiMiYazdir(8);
        asalsayiMiYazdir(2);
        asalsayiMiYazdir(1);
    }
    public static void asalsayiMiYazdir(int sayi){
        int flag=0;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                flag++;
                break;
            }
        }
        if (flag==0){
            System.out.println("Girilen "+sayi+" sayisi asal bir sayidir");
        }else {
            System.out.println("Girilen "+sayi+" sayisi asal bir sayi degildir");
        }
    }
}
