package day17_Arrays;

public class S04_Arrays {
    public static void main(String[] args) {
        //   Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //   kullanildigini yazdiran bir method olusturun.
        int[] arr1 ={2,4,5,2,6,4,7,3,5,2};
        elemanSayisiYazdir(arr1,2);
        elemanSayisiYazdir(arr1,3);
        elemanSayisiYazdir(arr1,5);
    }
    public static void elemanSayisiYazdir(int[] arr,int arananElement){
        int sayac =0;
        for (int i = 0; i < arr.length; i++) {
           if ( arr[i]==arananElement){
               sayac++;
           }
        }
        System.out.println(sayac);
    }
}
