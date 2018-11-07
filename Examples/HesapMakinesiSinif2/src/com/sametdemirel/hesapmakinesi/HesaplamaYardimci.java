package com.sametdemirel.hesapmakinesi;

public class HesaplamaYardimci {

    private static final char Toplama_Isareti = '+';
    private static final char Carpma_Isareti = '*';
    private static final char Cikarma_Isareti = '-';
    private static final char Bolme_Isareti = '/';

    DortIslem islem;
    double ilkDeger;
    double ikinciDeger;
    double sonuc;

    public void islem(String ifade) throws GecersizIfadeException{

        String[] bolumler = ifade.split(" ");


        if(bolumler.length != 3){
            throw new GecersizIfadeException("Az veya Fazla Parametre", ifade);
        }

        String islemTipi = bolumler[0];

        try{
            ilkDeger = Double.parseDouble(bolumler[1]);
            ikinciDeger = Double.parseDouble(bolumler[2]);
        } catch (NumberFormatException e){
            throw new GecersizIfadeException("Numerik Olmayan Karakter", ifade, e);
        }
        setIslemTipiBelirle(islemTipi);

        if(islem == null)
            throw new GecersizIfadeException("Gecersiz İşlem Tipi", ifade);


        HesaplamaTemel hesaplama = null;

        switch(islem){
            case Toplama:
                hesaplama = new Toplama(ilkDeger, ikinciDeger);
                break;
            case Carpma:
                hesaplama = new Carpma(ilkDeger, ikinciDeger);
                break;
            case Cikarma:
                hesaplama = new Cikarma(ilkDeger, ikinciDeger);
                break;
            case Bolme:
                hesaplama = new Bolme(ilkDeger, ikinciDeger);
                break;
        }
        hesaplama.hesapla();
        sonuc = hesaplama.getSonuc();
    }
    private void setIslemTipiBelirle(String islemTipi){
        if(islemTipi.equalsIgnoreCase(DortIslem.Toplama.toString())){
            islem = DortIslem.Toplama;
        }
        else if(islemTipi.equalsIgnoreCase(DortIslem.Carpma.toString())){
            islem = DortIslem.Carpma;
        }
        else if(islemTipi.equalsIgnoreCase(DortIslem.Cikarma.toString())){
            islem = DortIslem.Cikarma;
        }
        else if(islemTipi.equalsIgnoreCase(DortIslem.Bolme.toString())){
            islem = DortIslem.Bolme;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(20);

        char sembol = ' ';
        switch (islem){
            case Toplama:
                sembol = Toplama_Isareti;
                break;
            case Carpma:
                sembol = Carpma_Isareti;
                break;
            case Cikarma:
                sembol = Cikarma_Isareti;
                break;
            case Bolme:
                sembol = Bolme_Isareti;
                break;
        }
        sb.append(ilkDeger);
        sb.append(' ');
        sb.append(sembol);
        sb.append(' ');
        sb.append(ikinciDeger);
        sb.append(' ');
        sb.append('=');
        sb.append(' ');
        sb.append(sonuc);

        return sb.toString();
    }
}
