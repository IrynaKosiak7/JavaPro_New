package de.telran.lesson0228.ClassWork;

import java.util.Arrays;

public class UseSeasons {
    public static void main(String[] args) {
        Season season = Season.AUTUMN;
        System.out.println(season);
        System.out.println(season.ordinal());
        Season[] seasons = Season.values();
        System.out.println(Arrays.toString(seasons));
        Season summer = Season.valueOf("SUMMER");
        System.out.println(summer);

        printSeasonMassage(season);
    }
public static String getSeasonMessage(Season season){
    String message = switch (season) {
        case AUTUMN -> {
            yield "Autumn message";
        }
        case SPRING -> "Spring message";
        case SUMMER -> "Summer message";
        case WINTER -> "Winter message";
    };
    return message;
}
    public static  void printSeasonMassage(Season season){
        switch (season){
            case WINTER -> System.out.println("It's cold winter");
            case  SPRING -> System.out.println("Spring is coming. Flowers are blooming");
            case AUTUMN -> System.out.println("It's rainy autumn ");
            default -> System.out.println("summer is best season of year");
        }
        //        switch (season){
//            case WINTER:
//                System.out.println("It's cold winter");
//                break;
//            case SPRING:
//                System.out.println("Spring is coming. Flowers are blooming");
//                break;
//            case AUTUMN:
//                System.out.println("It's rainy autumn");
//                break;
//            default:
//                System.out.println("Summer is the best season of year");
//                break;
//        }
    }
}
