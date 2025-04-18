package day12_ForLoops;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        int satir =4;
        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
