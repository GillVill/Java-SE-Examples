package com.sametdemirel.ortalamasurat;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner tara = new Scanner(System.in);

        System.out.print("Süreyi giriniz(d.s.salise cinsinden): ");
        String sure = tara.nextLine();

        System.out.print("Toplam Mesafeyi Giriniz(Metre cinsinden): ");
        String mesafe = tara.nextLine();

        //System.out.println(sure);
        String[] zamanAyir = sure.split("\\.");

        double toplamSure = Double.valueOf(zamanAyir[0])*60+
                Double.valueOf(zamanAyir[1])+
                Double.valueOf(zamanAyir[2])/1000;
        double ortalamaSurat = Double.valueOf(mesafe)/toplamSure*3.6;
        System.out.println("Ortalama Sürat: "+ortalamaSurat+" km/h");
    }
}
