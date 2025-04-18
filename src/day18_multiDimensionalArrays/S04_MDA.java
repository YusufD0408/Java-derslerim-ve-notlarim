package day18_multiDimensionalArrays;

public class S04_MDA {
    public static void main(String[] args) {
        //   Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        //           method olusturun.

        int[][] arr ={{3,4,5},{2,3},{1}};
        /*int sayilarinCarpimi =1;
        for (int i = 0; i <arr.length ; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                sayilarinCarpimi *=arr[i][j];
            }
        }
        System.out.println(sayilarinCarpimi);
         */
        System.out.println("Array'deki tum elementlerin carpimi"+sayilariCarp(arr));
    }
public static int sayilariCarp(int[][] arr) {
    int sayilarinCarpimi =1;
    for (int i = 0; i <arr.length ; i++) {

        for (int j = 0; j < arr[i].length; j++) {
            sayilarinCarpimi *=arr[i][j];
        }
          }
    return sayilarinCarpimi;

      }

}
