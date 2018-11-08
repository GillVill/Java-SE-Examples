package com.sametdemirel.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateComparison {
    public static void main(String[] args) throws ParseException {
        //Date.before(), Date.after() and Date.equals()
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

        Date nowDate = sdf.parse("2018.11.8");
        Date toCompareDate = sdf.parse("2018.11.9");

        if(nowDate.before(toCompareDate))
            System.out.println("Şu anda 9 Kasım'dan daha gerideyiz...");
        else if(nowDate.equals(toCompareDate))
            System.out.println("Bugün günlerden 8 Kasım");
        else
            System.out.println("Şu anda 9 Kasım'dan ierideyiz.");
    }
}
