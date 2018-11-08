package com.sametdemirel.date;

import java.util.*;
import static java.util.Calendar.*;


public class Calendar {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        //Get current year using GregorianCalendar.YEAR
        int year = GregorianCalendar.YEAR;

        //Create a Gregorian calendar initialized with the current date and time in the default locale and timezone.
        GregorianCalendar calendar = new GregorianCalendar();
        //Print current date and time information
        System.out.println("Date: "+ months[calendar.get(MONTH)]+ " "+ calendar.get(DATE)+" "+ calendar.get(YEAR));
        System.out.println("Time: "+ calendar.get(HOUR)+ ":"+ calendar.get(MINUTE)+ ":"+ calendar.get(SECOND));

        //Test if the current year is a leap year
        if(calendar.isLeapYear(year)){
            System.out.println("2018 is a leap year");
        }
        else
            System.out.println("2018 is not a leap year");
    }
}
