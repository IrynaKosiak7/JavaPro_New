package de.telran.lesson0513.homework;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.stream.Collectors;

public class HomeTasks {
    public static void main(String[] args) {
//  1) Составить список времен начала всех занятий по Java за июнь, если предположить, что они будут проходить каждый понедельник/среду c 9:30 CET.
        LocalDate start = LocalDate.of(2024, Month.JUNE, 1);
        LocalDate end = LocalDate.of(2024, Month.JUNE, 30);
        LocalTime lessonsTime = LocalTime.of(9, 30);
        ZoneId zonedDateTime = ZoneId.of("CET");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm z");
        for (LocalDate date = start; !date.isAfter(end); date = date.plusDays(1)) {
            if (date.getDayOfWeek() == DayOfWeek.MONDAY || date.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
                LocalDateTime lessonTime = LocalDateTime.of(date, lessonsTime);
                ZonedDateTime lessonInZoneTime = lessonTime.atZone(zonedDateTime);
                System.out.println(formatter.format(lessonInZoneTime));
            }
        }


//  2) Рейс из Лос-Анджелеса во Франкфурт отправляется в 15:05 по местному времени и длится 10 ч. 50 м. Во сколько он прилетит? Написать метод,
//  который мог бы совершать подобные вычисления.
        arrivalTimeCalculation(LocalDate.of(2024, 8, 15), LocalTime.of(15, 05),
                ZoneId.of("America/Los_Angeles"), ZoneId.of("Europe/Berlin"), 650);


    }

    public static void arrivalTimeCalculation(LocalDate dateDeparture, LocalTime timeDeparture, ZoneId zoneDeparture, ZoneId arrivalZone, int timeFlight) {
        LocalDateTime dateTimeDeparture = LocalDateTime.of(dateDeparture, timeDeparture);
        ZoneId departureZone = zoneDeparture;
        ZonedDateTime departureTimeDateZone = ZonedDateTime.of(dateTimeDeparture, departureZone);
        System.out.println(departureTimeDateZone);

        ZonedDateTime arrivalZoneDateTime = ZonedDateTime.of(dateTimeDeparture.plusMinutes(timeFlight), arrivalZone);
        System.out.println(arrivalZoneDateTime);
    }

}
