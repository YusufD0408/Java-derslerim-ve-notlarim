package day18_multiDimensionalArrays;

public class S01_MDA {
    public static void main(String[] args) {
        //   Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
        //           method olusturun.
        int[][] arr ={{1,2,3,4,5,6,7,8,9},{10,11,12,13,14},{15,16,17,18,19}};
        ciftElementleriTopla(arr);

    }
    public static void ciftElementleriTopla(int[][] arr){
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0)
                    toplam+=arr[i][j];
            }
        }
        System.out.println("ELementlerin toplami : "+toplam);
    }
}
