package day14_MethodOverloadding_WhileLoop;

public class C02_isAsal {
    public static void main(String[] args) {
        // verilen 1'den buyuk bir tamsayi icin sayi asl ise true
        // sayi asal degilse false dönen bir method olusturun
        System.out.println(isAsal(20));
       boolean sonuc= isAsal(33);
        System.out.println(sonuc);
        System.out.println(isAsal(2));
    }
    public static boolean isAsal(int sayi){
        int flag=0;
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                flag++;
                break;
            }
        }
        if (flag==0){
            return true;
        }else {
            return false;
        }

    }
}
