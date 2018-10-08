package com.company;
/**
 *  Calculates the lunar drift from Earth to the moon as compared to a
 *  specified starting year.
 *
 * @author Foothill College, [Kuan-lung, Chen]
 */
import java.time.Year;

public class CalculateLunarDrift {

    public static void main(String[] args) {
        final double LUNAR_DRIFT = 3.8;
        final int METERS_TO_CM = 100 , STARTING_YEAR = 1900;
        final long STARTING_DISTANCE = 368042000;

        //Test 1
        int yearOflnterest = 1502;
        double resultingDistance = STARTING_DISTANCE + (LUNAR_DRIFT * (yearOflnterest - STARTING_YEAR)) / (METERS_TO_CM);
        System.out.println("Hello. Welcome to lunar rift calculator.");
        System.out.println("Distance of Earth to moon in year 1900 is 3680420 meters.");
        System.out.println( "Test case 1:");
        System.out.println("Distance of Earth to moon in year"+" "+ yearOflnterest+" "+ "was: " + resultingDistance  +" "+ "meters.");
        System.out.println("History: In 1502, Cesare Borgia (son of pope Alexander VI) occupied Urbino.");
        double difference = resultingDistance - STARTING_DISTANCE;
        System.out.println("Difference between moon in year 1900 and year"+" "+ yearOflnterest+" "+ " is: " + difference  +" "+ "meters.");

        //Test 2
        int yearOflnterestsecond = 1969;
        double resultingDistancesecond = STARTING_DISTANCE + (LUNAR_DRIFT * (yearOflnterestsecond - STARTING_YEAR)) / (METERS_TO_CM);
        System.out.println("Test case 2:");
        System.out.println("Distance of Earth to moon in year "+" "+ yearOflnterestsecond+" "+  "was: " + resultingDistancesecond +" "+"meters.");
        System.out.println("In 1969, Soviet weather satellite Meteor 1 launched.");
        double differencesecond = resultingDistancesecond - STARTING_DISTANCE;
        System.out.println("Difference between moon in year 1900 and year "+" "+ yearOflnterestsecond+" "+  "is: " + differencesecond  +" "+"meters.");

        //Test 3
        int yearOflnterestthird = 1997;
        double resultingDistancethird = STARTING_DISTANCE + (LUNAR_DRIFT * (yearOflnterestthird - STARTING_YEAR)) / (METERS_TO_CM);
        System.out.println("Test case 3:");
        System.out.println("Distance of Earth to moon in year"+" "+" "+ yearOflnterestthird+" "+ "was: " + resultingDistancethird  +" "+ "meters.");
        double differencethird = resultingDistancethird - STARTING_DISTANCE;
        System.out.println("History: In 1997, I came to this world.");
        System.out.println("Difference between moon in year 1900 and year"+" "+ yearOflnterestthird+" "+ "is: " + differencethird  +" "+ "meters.");
    }
}
