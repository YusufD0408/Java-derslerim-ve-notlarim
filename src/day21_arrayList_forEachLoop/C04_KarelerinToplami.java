package day21_arrayList_forEachLoop;

public class C04_KarelerinToplami {
    public static void main(String[] args) {
        //   Soru 2- Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
        //   yazdiran bir method olusturun.

        int[] arr ={2,3,5};
        karelerininToplaminiYazdir(arr);

    }
    public static void karelerininToplaminiYazdir(int[] arr){
        int karelerToplami =0;
        for (int each:arr
             ) {
          karelerToplami += each*each;
        }
        System.out.println("Verien array'deki elementlerin kareleri toplami :"+karelerToplami);
    }
}
