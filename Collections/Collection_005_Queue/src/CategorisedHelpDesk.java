package com.sametdemirel.koleksiyonlar;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

import static com.sametdemirel.koleksiyonlar.Category.PRINTER;

public class CategorisedHelpDesk {
    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

    public boolean enquire(final Customer customer, final Category type){
        return enquiries.offer(new Enquiry(customer, type));
    }

    public void processPrinterEnquiry(){
        //Predicate<Enquiry> predicate = enq -> enq.getCategory() == PRINTER;
        processEnquiry(enq -> enq.getCategory() == PRINTER, "Is it out of paper?");
    }

    public void processGeneralEnquiry(){
        //Predicate<Enquiry> predicate = enq -> enq.getCategory() != PRINTER;
        processEnquiry(enq -> enq.getCategory() != PRINTER, "Have you tried turning it off and on again?");
    }

    // processPrınterEnquiry ve processGeneralEnquiry'de ortak olarak yer alan kod parçaçığını Ctrl+Alt+M ile metot haline getirdik...
    private void processEnquiry(Predicate<Enquiry> predicate, String message) {

        final Enquiry enquiry = enquiries.peek();

        if (enquiry != null && predicate.test(enquiry)) {
            enquiries.remove();
            enquiry.getCustomer().reply(message);
        } else
            System.out.println("No work to do, let's have some coffee!");
    }

    /*public void processPrinterEnquiry(){
        final Enquiry enquiry = enquiries.peek();
        if(enquiry != null && enquiry.getCategory() == PRINTER){
            enquiries.remove();
            enquiry.getCustomer().reply("Is it out of paper?");
        }
        else
            System.out.println("No work to do, let's have some coffee!");
    }*/

    /*public void processGeneralEnquiry(){
        final Enquiry enquiry = enquiries.peek();
        if(enquiry != null && enquiry.getCategory() != PRINTER){
            enquiries.remove();
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
        }
        else
            System.out.println("No work to do, let's have some coffee!");
    }*/

    public static void main(String[] args) {

        CategorisedHelpDesk categorisedHelpDesk = new CategorisedHelpDesk();

        categorisedHelpDesk.enquire(Customer.JACK, Category.PHONE);
        categorisedHelpDesk.enquire(Customer.JILL, Category.PRINTER);

        categorisedHelpDesk.processPrinterEnquiry();
        categorisedHelpDesk.processGeneralEnquiry();
        categorisedHelpDesk.processPrinterEnquiry();
    }
}

