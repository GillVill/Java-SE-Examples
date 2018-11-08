package com.sametdemirel.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {

    public static void main(String[] args) {
        //Create a Date object
        Date date = new Date();

        // Set date and time format
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E yyyy.MM.dd 'saat' hh:mm:ss a zzz");
        System.out.println("SimpleDateFormat: "+ simpleDateFormat.format(date));

        /*                          Simple DateFormat Format Codes
        Character	                Description	                            Example
        G	                        Era designator	                        AD
        y	                        Year in four digits	                    2001
        M	                        Month in year	                        July or 07
        d	                        Day in month	                        10
        h	                        Hour in A.M./P.M.(1~12)	                12
        H	                        Hour in day (0~23)	                    22
        m	                        Minute in hour	                        30
        s	                        Second in minute	                    55
        S	                        Millisecond	                            234
        E	                        Day in week	                            Tuesday
        D	                        Day in year	                            360
        F	                        Day of week in month	                2 (second Wed. in July)
        w	                        Week in year	                        40
        W	                        Week in month	                        1
        a	                        A.M./P.M. marker	                    PM
        k	                        Hour in day (1~24)	                    24
        K	                        Hour in A.M./P.M. (0~11)	            10
        z	                        Time zone	                            Eastern Standard Time
        '	                        Escape for text	                        Delimiter
        "	                        Single quote	                        `
        */

        //Date Formatting using printf
        Date date1 = new Date();
        /*Date and time formatting can be done very easily using printf method. You use a two-letter format,
        starting with %t and ending in one of the letters of the table as shown in the following code.*/
        System.out.printf("Current Date/Time using printf: %tc", date1);
        //Print date (Month dd, yyyy -> November 8, 2018)
        System.out.printf("\n%1$s %2$tB %2$td, %2$tY", "Due date:", date1);
        //You can use '<' flag
        System.out.printf("\n%s %tB %<te, %<tY", "Due date:", date1);
        System.out.printf("\nSeconds since 1970-01-01 00:00:00 GMT: %ts", date1);

        /*                          Date and Time Conversion Characters
        Character	                Description	                                            Example
        c	                        Complete date and time	                                Mon May 04 09:51:52 CDT 2009
        F	                        ISO 8601 date	                                        2004-02-09
        D	                        U.S. formatted date (month/day/year)	                02/09/2004
        T	                        24-hour time	                                        18:05:19
        r	                        12-hour time	                                        06:05:19 pm
        R	                        24-hour time, no seconds	                            18:05
        Y	                        Four-digit year (with leading zeroes)	                2004
        y	                        Last two digits of the year (with leading zeroes)	    04
        C	                        First two digits of the year (with leading zeroes)	    20
        B	                        Full month name	                                        February
        b	                        Abbreviated month name	                                Feb
        m	                        Two-digit month (with leading zeroes)	                02
        d	                        Two-digit day (with leading zeroes)	                    03
        e	                        Two-digit day (without leading zeroes)	                9
        A	                        Full weekday name	                                    Monday
        a	                        Abbreviated weekday name	                            Mon
        j	                        Three-digit day of year (with leading zeroes)	        069
        H	                        Two-digit hour (with leading zeroes),                  18
                                    between 00 and 23
        k	                        Two-digit hour (without leading zeroes),               18
                                    between 0 and 23
        I	                        Two-digit hour (with leading zeroes),                  06
                                    between 01 and 12
        l	                        Two-digit hour (without leading zeroes),               6
                                    between 1 and 12
        M	                        Two-digit minutes (with leading zeroes)	                05
        S	                        Two-digit seconds (with leading zeroes)	                19
        L	                        Three-digit milliseconds (with leading zeroes)	        047
        N	                        Nine-digit nanoseconds (with leading zeroes)	        047000000
        P	                        Uppercase morning or afternoon marker	                PM
        p	                        Lowercase morning or afternoon marker	                pm
        z	                        RFC 822 numeric offset from GMT	                        -0800
        Z	                        Time zone	                                            PST
        s	                        Seconds since 1970-01-01 00:00:00 GMT	                1078884319
        Q	                        Milliseconds since 1970-01-01 00:00:00 GMT	            1078884319047
         */

    }
}
