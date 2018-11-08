package com.sametdemirel.date;

import java.util.Date;

public class Sleeping {
    public static void main(String[] args) {
        try {
            //Print current time
            System.out.println(new Date());
            //3 sec sleeping
            Thread.sleep(5*60*10);
            //Print current time after sleeping 3 sec
            System.out.println(new Date());
        }catch (Exception e){
            System.out.println("Got an exception!");
        }
    }
}
