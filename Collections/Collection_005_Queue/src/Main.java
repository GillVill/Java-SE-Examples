package com.sametdemirel.koleksiyonlar;

public class Main {

    public static void main(String[] args) {

        HelpDesk helpDesk = new HelpDesk();

        helpDesk.enquire(Customer.JACK, Category.PRINTER);
        helpDesk.enquire(Customer.JILL, Category.PHONE);

        //helpDesk.processPrinterEnquiry();
        //helpDesk.processGeneralEnquiry();
        //helpDesk.processPrinterEnquiry();

        helpDesk.processAllEnquiries();
    }
}
