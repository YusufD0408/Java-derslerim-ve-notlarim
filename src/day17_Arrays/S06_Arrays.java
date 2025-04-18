package day17_Arrays;

public class S06_Arrays {
    public static void main(String[] args) {
        //     Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //             olusturun
        String[] arr1 = {"Eda","Merve","Ayse","Naime","Su"};
        EnuzunEnkisaYazdir(arr1);
    }
    public static void EnuzunEnkisaYazdir(String[] arr){
        String enuzunkelime=arr[0];
        String enkisakelime=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()>enuzunkelime.length()){
                enuzunkelime=arr[i];
            }
            if (arr[i].length()<enkisakelime.length()){
                enkisakelime=arr[i];
            }
        }
        System.out.println("array'daki en uzun kelime : "+enuzunkelime);
        System.out.println("array'daki en kisa kelime : "+enkisakelime);
    }
}
