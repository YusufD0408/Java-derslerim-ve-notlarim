package day18_multiDimensionalArrays;

public class C04_MDA {
    public static void main(String[] args) {
        int[][] arr ={{3,5,7},{1,2,3,4},{1,2},{7}};
        // toplam elemen sayisi kactir
        int toplamElementSAyisi =0;
        for (int i = 0; i < arr.length; i++) {
            toplamElementSAyisi+= arr[i].length;
        }
        System.out.println("Toplam element sayısı : " + toplamElementSAyisi);

        // tum elementlerin toplami
        // MDA 'lerde bir elementi elden gecirmek istiyorsak kat sayisi kadar nesed forloop olusturulur
        int elementlerToplami=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
               elementlerToplami+= arr[i][j];
            }
        }
        System.out.println("Elementlerin Toplami : "+elementlerToplami);
    }
}
