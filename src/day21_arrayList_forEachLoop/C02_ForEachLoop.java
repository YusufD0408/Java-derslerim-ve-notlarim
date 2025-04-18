package day21_arrayList_forEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        // bizde istenen gorevde siralama onemsizse asil
        // amaclanan tum elementleri elden gecirmek ise for each loop  tercih edilir
        // for each loop'da
        //         - index yok
        //         - baslangic degeri yok
        //         - bitis degeri yok
        int[] arr={3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};
        // arra'in tum elementlerinin toplamini yazdirin
        int top =0;
        for (int each:arr
             ) {
           top +=each;
        }
        System.out.println("Elementlerin toplami : "+top);
        /*
        int top =0;
        for (int i = 0; i < arr.length; i++) {
            top +=arr[i];
        }
        System.out.println("Toplam : "+top);


         */
        // arr'in elementlerinden 3 ile bolunebilenleri yazdirin
        for (int each:arr
             ) {
            if (each%3==0) System.out.print(each+" ");
        }
        System.out.println("");
        /*
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0){

                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("");

         */
        // array'in elementleri icerisinde kac tane teksayi oldugunu bulun

        int tekSayi=0;
        for (int each:arr
             ) {
            if (each%2!=0)  tekSayi++;
        }
        System.out.println("Tek sayi sayis : "+tekSayi);
        /*
           int tekSayi=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2!=0){
                tekSayi++;
            }
        }
        System.out.println("Tek sayi sayisi : "+tekSayi);
        */

    }
}
