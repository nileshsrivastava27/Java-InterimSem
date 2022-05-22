package dtpkg;



import java.time.Clock;

import java.time.Instant;

import java.time.LocalDate;

import java.time.LocalDateTime;

import java.time.Month;

import java.time.OffsetDateTime;

import java.time.OffsetTime;

import java.time.ZoneId;

import java.time.ZoneOffset;

import java.time.ZonedDateTime;

import java.time.format.DateTimeFormatter;



public class TimeZone {

    public TimeZone(){

//1.Time zone ID

        ZoneId id = ZoneId.of("Europe/Paris");

        System.out.println(id);

//2.Time zone Offset

        ZoneOffset offset = ZoneOffset.of("-06:00");

        System.out.println(offset);

//3.Zone date timw

//ZonedDateTime zdt1 = ZonedDateTime.parse("2014-12-03T10:15:300[Europe/Paris]");//2014-12-03T10:15:300Z[Europe/Dublin]

        ZonedDateTime zdt1 = ZonedDateTime.parse("2000-12-31T10:15:30+01:00[Europe/Paris]");//2014-12-03T10:15:300Z[Europe/Dublin]

        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("Europe/Paris"));

        System.out.println(zdt1);

        System.out.println(zdt2);

//4.Offset time

        OffsetDateTime odt = OffsetDateTime.of(LocalDateTime.now(),ZoneOffset.of("-4")); //2015-05-22T23:42:20.101-06:00

        OffsetTime ot = OffsetTime.ofInstant(Instant.now(),ZoneId.of("America/Los_Angeles")); //22:42:20.101-07:00

        System.out.println(odt);

        System.out.println(ot);

//5.Clock

        Clock defaultZone = Clock.systemDefaultZone();

        Clock clock = Clock.system(ZoneId.of("Europe/Paris"));

        System.out.println(defaultZone);

        System.out.println(clock);

//6.Formatting

        LocalDateTime dt = LocalDateTime.of( 2010, Month.JULY, 3, 9, 0, 30 );

        String isoDateTime = dt.format(DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(dt);

        System.out.println(isoDateTime);

        LocalDate dtt = LocalDate.parse( "2014/09/19 14:05:12", DateTimeFormatter.ofPattern( "yyyy/MM/dd kk:mm:ss" ) );

        System.out.println(dtt);

    }

}