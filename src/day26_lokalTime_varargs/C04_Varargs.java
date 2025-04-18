package day26_lokalTime_varargs;

public class C04_Varargs {
    public static void main(String[] args) {
        // verilen iki sayiyi toplayip yazdiran bir method olusturun
        topla(3,6);
        topla(2,3,4);
        topla(1,2,3,4);
    }
    public static void topla(int a,int b){
        System.out.println("Toplam : "+(a+b));
    }
    public static void topla(int a,int b,int c){
        System.out.println("Toplam : "+(a+b));
    }
    public static void topla(int a,int b,int c,int d){
        System.out.println("Toplam : "+(a+b));
    }
}
