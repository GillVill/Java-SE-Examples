package com.sametdemirel;

public class Main {

    public static void main(String[] args) {
        double[] ilkDegerler = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] ikinciDegerler = {50.0d, 92.0d, 17.0d, 3.0d};
        String[] islemtipi = {"Bolme", "Toplama", "Cikarma", "Carpma"};

        double[] sonuclar = new double[islemtipi.length];

        /*for(int i=0; i<islemtipi.length; i++){
            if(islemtipi[i].equals("Toplama"))
                sonuclar[i] = ilkDegerler[i] + ikinciDegerler[i];
            else if(islemtipi[i].equals("Cikarma"))
                sonuclar[i] = ilkDegerler[i] - ikinciDegerler[i];
            else if(islemtipi[i].equals("Bolme"))
                sonuclar[i] = ilkDegerler[i] / ikinciDegerler[i];
            else if(islemtipi[i].equals("Carpma"))
                sonuclar[i] = ilkDegerler[i] * ikinciDegerler[i];
        }*/

        /*for(double sonuclarGecici: sonuclar)
            System.out.println("Sonuc: " + sonuclarGecici);*/

        for (int i=0; i<islemtipi.length; i++){
            switch (islemtipi[i]){
                case "Toplama":
                    sonuclar[i] = ilkDegerler[i] + ikinciDegerler[i];
                    break;
                case "Cikarma":
                    sonuclar[i] = ilkDegerler[i] - ikinciDegerler[i];
                    break;
                case "Carpma":
                    sonuclar[i] = ilkDegerler[i] * ikinciDegerler[i];
                    break;
                case "Bolme":
                    sonuclar[i] = ilkDegerler[i] / ikinciDegerler[i];
                    break;
                default:
                    System.out.println("Hatalı işlem tipi...");
                    break;
            }
        }
        for (double sonuclarGecici: sonuclar){
                System.out.println("Sonuc: "+sonuclarGecici);
        }
        /*for(int j=0; j<sonuclar.length; j++){
            System.out.println("Sonuc: " + sonuclar[j]);
        }*/
    }
}
