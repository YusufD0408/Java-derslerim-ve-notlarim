package day14_MethodOverloadding_WhileLoop;

public class C04_MethodOverLoading {
    public static void main(String[] args) {
      topla(3,5);
      topla(2,4);
    }
    public static void topla(int a,int b){
        System.out.println("iki tamsayinin toplami : "+(a+b));
    }
    public static void  topla(double a,double b){

    }
    public static void topla(int a,double b){

    }
    public static void topla(double a,int b){

    }
}
