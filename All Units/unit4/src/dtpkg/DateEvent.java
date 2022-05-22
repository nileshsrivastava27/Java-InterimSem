package dtpkg;



import java.time.Duration;

import java.time.Instant;

import java.time.LocalDate;

import java.time.LocalDateTime;

import java.time.LocalTime;

import java.time.Period;

import java.time.temporal.ChronoUnit;



public class DateEvent {

    public DateEvent(){

//1.Instance

        Instant i = Instant.now();

        System.out.println(i);

//2.Today, Period and Next week

        LocalDateTime today = LocalDateTime.now();

        Period period = Period.ofDays(7);

        LocalDateTime nextWeek = today.plus(period);

        System.out.println(today);

        System.out.println(period);

        System.out.println(nextWeek);

//3.Duration

        LocalTime noww = LocalTime.now();

        Duration tenMinutes = Duration.ofMinutes(10);

        LocalTime tenMinutesLater = noww.plus(tenMinutes);

        System.out.println(noww);

        System.out.println(tenMinutes);

        System.out.println(tenMinutesLater);

//4.Period & Duration

        LocalDate ld1 = LocalDate.parse("1979-03-17");

        LocalDate ld2 = LocalDate.parse("2022-03-16");

        Period timeBetween = Period.between(ld1,ld2); //Difference in years, months, days

        Duration timeSpan = Duration.between(LocalTime.now(),LocalTime.MAX); //Difference in hours, minutes, seconds

        System.out.println(ld1);

        System.out.println(ld2);

        System.out.println(timeBetween);

        System.out.println(timeSpan);

//5.Chrono unit

        System.out.println(ChronoUnit.YEARS.between(ld1, ld2));



    }

}