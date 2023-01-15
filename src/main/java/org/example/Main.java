package org.example;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Date.*;

public class Main {

    public static void main(String[] args) {
      LocalDate today=LocalDate.now();
      LocalDate birthDate=LocalDate.of(1996,9,24);
      int years=Period.between(birthDate,today).getYears();
      int month=Period.between(birthDate,today).getMonths();
      int days=Period.between(birthDate,today).getDays();
        System.out.println(today);
        System.out.println(birthDate);
        System.out.println(years);
        System.out.println(month);
        System.out.println(days);
        LocalDate d1 = today.plusMonths(1).withDayOfMonth(1);
        System.out.println(d1);
        BirthDate b=new BirthDate();
        b.getAge();
    }
}
