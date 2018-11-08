package com.sametdemirel.date;

import java.util.Date;

public class ElapsedTime {
    public static void main(String[] args) {
        try {
            //Start time get using currentTimeMillis()
            long start = System.currentTimeMillis();
            System.out.println(new Date());
            //3 sec sleeping
            Thread.sleep(5*60*10);
            System.out.println(new Date());
            //Ending time get using currentTimeMillis()
            long end = System.currentTimeMillis();
            //Elapsed time is calculating
            long differTime = end - start;
            //Print elapsed time(ms)
            System.out.println("Elapsed time: "+ differTime+ " ms");
        }catch (Exception e){
            System.out.println("Got an exception!");
        }
    }
}
;