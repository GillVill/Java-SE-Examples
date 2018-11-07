package com.sametdemirel.hesapmakinesi;

public class DinamikYardimci {

    private MatematikIslemleri[] yakalayicilar;

    public DinamikYardimci(MatematikIslemleri[] yakalayicilar){
        this.yakalayicilar = yakalayicilar;
    }

    public String islem(String ifade){

        String[] bolumler = ifade.split(MatematikIslemleri.AYIRICI);

        String anahtarKelime = bolumler[0];

        MatematikIslemleri yakalama = null;
        for(MatematikIslemleri yakalayici:yakalayicilar){
            if(anahtarKelime.equalsIgnoreCase(yakalayici.getAnahtarKelime())) {
                yakalama = yakalayici;
                break;
            }
        }
        double ilkDeg = Double.parseDouble(bolumler[1]);
        double ikinciDeg = Double.parseDouble(bolumler[2]);

        double sonuc = yakalama.hesaplamaYap(ilkDeg, ikinciDeg);

        StringBuilder sb = new StringBuilder(20);

        sb.append(ilkDeg);
        sb.append(' ');
        sb.append(yakalama.getSembol());
        sb.append(' ');
        sb.append(ikinciDeg);
        sb.append(' ');
        sb.append('=');
        sb.append(' ');
        sb.append(sonuc);

        return sb.toString();
    }
}
