package day35_interface;

public interface I01_Interface {
    int sayi =10;

    final  String  str= " Jva Candir";

    public static  final  boolean b = true;

    /*
    Interface'de tum variable'lar (Yazilmasa bile) puplic , static
    ve final'dir
    Final oldugu icin sonradan degistirme  imkani yoktur, olustururken
    deger aatanmalididir bu özellikler standart olarak tum variablelere tanimlandigindan
    bu tanimlamalari yapmak gerekli degildir(intelij gri yapti)


     */
  void toplama();
  public void cikarma ();
  abstract  String ekleme ();
  public abstract int faktoriyel();


  /*
  tüm methodlarda standar olarak puplic ve abstract 'tir (yazilmasada bile)

   */


}
