package day26_lokalTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {
        LocalTime saat1 = LocalTime.of(20,15);
        System.out.println(saat1);
        LocalTime saat= LocalTime.now();
        System.out.println(saat);
        /*
        LocalTime objesi olan saat variable'i canli bir saat degildir
        olusturdugu andaki local time'i sistemde alip kaydettigimiz sabit bir degerdir
        kodun ilerleyen kisminda ne kadar sure gectigini gormek icin saati
        yeniden almamiz gerekirse yeni bir localTime objesi oluturmaliyiz
         */

        System.out.println(saat.getHour());
        System.out.println(saat.getNano());
        System.out.println(saat.plusHours(2).plusMinutes(4));
        System.out.println(saat.minusMinutes(29).minusSeconds(38));
        System.out.println(saat.withSecond(0).withNano(0));
        System.out.println(saat.compareTo(saat1));
        System.out.println(saat.isAfter(saat1));
        System.out.println(saat.toSecondOfDay());
    }
}
