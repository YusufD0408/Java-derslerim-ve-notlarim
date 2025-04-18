package day34_AbstracktClass;

public abstract class  AHayvan {

/*
Bir class'i abstract class yapmakk icin deklarasyona abstract keyword yazmok yeterlidir.
Abstract class tar class olduklari loan constructor Lori vardir
ana abstrac classiidan obje olusturulamaz

 abstrack classlarda bugune kadar kullandigimiz
 yapilarda methodlar kullanabiliriz ancak bunlar
 child class'lar tarafindan uyarlamak(override) zorunda olmaz

 Child classlari uyarlamak istedigimiz methodlarida abstrack yapmaliyiz

 bir methodu abstrack yapmak icin delaration'ina abstrac yazmamiz yeterlidir


 */
          public abstract void hareket();
          public abstract void solunum();
         public abstract void beslenme();
         public abstract void cogalma();
         public abstract void omur();
}
