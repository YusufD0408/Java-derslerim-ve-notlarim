package day15_doWhileLoop_scope;

public class C02_RakamlarToplaminiBul {
    // verilen pozitif bir tamsayinin rakamlar toplamini bize donduren bir method lusturun

    public static int rakamlarinToplaminiBul(int verilenSayi){

        int birlerBsamagi=0;
        int rakamlarToplami=0;
        while (verilenSayi>0){
            birlerBsamagi=verilenSayi%10;
            rakamlarToplami+=birlerBsamagi;
            verilenSayi/=10;
        }
        return rakamlarToplami;

    }
}
