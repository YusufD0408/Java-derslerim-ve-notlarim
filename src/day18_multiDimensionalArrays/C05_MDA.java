package day18_multiDimensionalArrays;

public class C05_MDA {
    public static void main(String[] args) {
        int[][] arr ={{3,5,7},{1,2,3,4},{1,2},{7}};
        // arrayde kac tane cift sayi oldugunu bulun
        int ciftSayisi =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j =0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    ciftSayisi++;
                }
            }
        }
        System.out.println("cift sayi sayisi : "+ciftSayisi);
    }
}
