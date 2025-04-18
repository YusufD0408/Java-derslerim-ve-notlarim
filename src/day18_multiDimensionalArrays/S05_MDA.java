package day18_multiDimensionalArrays;

public class S05_MDA {
    public static void main(String[] args) {
        //    Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
        //            toplaminini yazdiran bir method olusturun.
        int[][] arr ={{1,2,3,4,5,6,7,8,9},{10,11,12,13,14},{15,16,17,18,19,20}};
        /*int top =0;
        for (int i = 0; i < arr.length; i++) {
                top+=arr[i][arr[i].length-1];

        }
        System.out.println("Son elementlerin toplami : "+top);
         */
         sonEmentlerinToplami(arr);
    }
    public static void sonEmentlerinToplami(int[][] arr){
        int toplami =0;
        for (int i = 0; i < arr.length; i++) {
            toplami+=arr[i][arr[i].length-1];
        }
        System.out.println("Son elementlerin toplami : "+toplami);
    }
}
