package day36_exception;

public class C01_TryCatch {
    public static void main(String[] args) {
        /*
        Kodlarimizi yazarken sorun olusma ihtimali gordugumuzde
        sorun cikma potansiyeli olan kodlari try catch (final) blok(lar) ile cereleriz

         */
        int sayi1 =20;
        int sayi2=0;


        try {
            System.out.println(sayi1/sayi2);
        } catch (ArithmeticException e) {
           // throw new RuntimeException(e);

            //System.out.println("O YAZILMAZ");
           // e.printStackTrace();  exception'da gordugumuz tum hata aciklamalarini yazdirir
           // System.out.println(e.getMessage()); by zero hatanin kaynagini gösterir
            //System.out.println(e.getCause());
        }


        /*
        bir try blogu 3 bölümde olusur
        1_ try blogu
        excepstion olusturma potansiyeli olan kodlar

        2- cartch (Exception e)
            catch statement  :
            Aritmetikexception  : olusma ihtimali olan exception
            e: karsilasacagi exception'i kaydedecegimiz obje

            3- catch blogu
            öngürülen exception gerceklestiginde calismasini istedidigimiz
            kodlar


         */








    }
}
