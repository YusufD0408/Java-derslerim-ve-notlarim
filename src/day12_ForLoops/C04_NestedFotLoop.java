package day12_ForLoops;

public class C04_NestedFotLoop {
    public static void main(String[] args) {
        int satiSayisi=4;
        for (int i = 1; i <=satiSayisi ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
