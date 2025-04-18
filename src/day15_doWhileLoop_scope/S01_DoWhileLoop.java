package day15_doWhileLoop_scope;

public class S01_DoWhileLoop {
    public static void main(String[] args) {
        // Soru 1- ’k’ harfinden ‘t’ harfine kadar harfleri yazdirin
        char harf='k';
        do {
            if (harf!='t'){
                System.out.print(harf+",");
            }else {
                System.out.print(harf+"");
            }
                harf++;


        }while (harf<='t');
    }
}
