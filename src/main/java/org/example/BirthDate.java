package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class BirthDate
{
    LocalDate birthDate;
    LocalDate today;
    LocalDate dun;
    LocalDate yarin;
    BirthDate(){

        today=LocalDate.now();
        birthDate=LocalDate.of(1996,9,24);

//        int years= Period.between(birthDate,today).getMonths();
//        int month=Period.between(birthDate,today).getMonths();
//        int days=Period.between(birthDate,today).getDays();
////        System.out.println(today);
////        System.out.println(birthDate);
//        System.out.println("numbers of years "+years);
////        System.out.println(month);
////        System.out.println(days);
//
//        System.out.println("bir isleri yapilacak .......................");
//        System.out.println("birthMath "+birthDate.getYear());
//        System.out.println("today's month "+today.getYear());
//        int i;
//        int j=today.getYear();
//        for(i=birthDate.getYear(); i<=j; i++){
//            System.out.println(i);

    }

    public void getAge(){

       // List<LocalDate> dates1=birthDate.datesUntil(today).collect(Collectors.toList());
       // System.out.println(dates1);
        List<LocalDate> dates=birthDate.datesUntil(today).toList();
        for(LocalDate i: dates) {
            System.out.println("date: "+i);
        }
    }

}
