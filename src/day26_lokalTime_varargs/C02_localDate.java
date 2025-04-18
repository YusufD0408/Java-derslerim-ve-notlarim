package day26_lokalTime_varargs;

import java.time.LocalDate;

public class C02_localDate {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);
        System.out.println(tarih.isLeapYear());
        LocalDate dogum =LocalDate.of(2024,3,3);
        System.out.println(dogum.getDayOfWeek());
    }
}
