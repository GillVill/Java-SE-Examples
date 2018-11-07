package com.sametdemirel.hesapmakinesi;

public class Hesaplama {
        //public double ilkDeger;
        //public double ikinciDeger;
        //public double sonuc;
        //public String islemTipi;

    private double ilkDeger;
    private double ikinciDeger;
    private double sonuc;
    private String islemTipi;

    public double getIlkDeger(){
        return ilkDeger;
    }
    public void setIlkDeger(double ilkDeger){
        this.ilkDeger = ilkDeger;
    }

    public double getIkinciDeger() {
        return ikinciDeger;
    }

    public void setIkinciDeger(double ikinciDeger) {
        this.ikinciDeger = ikinciDeger;
    }

    public double getSonuc() {
        return sonuc;
    }

    /*public void setSonuc(double sonuc) {
        this.sonuc = sonuc;
    }*/

    public String getIslemTipi() {
        return islemTipi;
    }

    public void setIslemTipi(String islemTipi) {
        this.islemTipi = islemTipi;
    }
    public Hesaplama(){}

    public Hesaplama(String islemTipi){
        this.islemTipi = islemTipi;
    }

    public Hesaplama(String islemTipi, double ilkDeger, double ikinciDeger){
        this(islemTipi);
        this.ilkDeger = ilkDeger;
        this.ikinciDeger = ikinciDeger;
    }

    //İki değer alan bir hesapla fonksiyonu yazalım bu parametresiz hesapla metodunu overload edecek
    public void hesapla(double ilkDeger, double ikinciDeger){
        setIlkDeger(ilkDeger);
        setIkinciDeger(ikinciDeger);
        hesapla();
    }

    public void hesapla(int ilkDeger, int ikinciDeger){
        this.ilkDeger = ilkDeger;
        this.ikinciDeger = ikinciDeger;
        hesapla();

        sonuc = (int) sonuc; //Sonucun int şeklinde yazılması için cast ediyoruz
    }

    public void hesapla(){
        switch (islemTipi){
            case "Bolme":
                sonuc = ilkDeger / ikinciDeger;
                break;
             case "Toplama":
                 sonuc = ilkDeger + ikinciDeger;
                 break;
             case "Cikarma":
                 sonuc = ilkDeger - ikinciDeger;
                 break;
             case "Carpma":
                 sonuc = ilkDeger * ikinciDeger;
                 break;
              default:
                  System.out.println("Hatalı bir işlem tipi...");
                  sonuc = 0.0d;
                  break;
            }
    }
}
