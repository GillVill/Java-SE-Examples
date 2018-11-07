package com.sametdemirel.koleksiyonlar;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityHelpDesk {

    private static final Comparator<Enquiry> BY_CATEGORY = new Comparator<Enquiry>() {
        @Override
        public int compare(Enquiry o1, Enquiry o2) {
            return o1.getCategory().compareTo(o2.getCategory());
        }
    };

    private final Queue<Enquiry> enquiries = new PriorityQueue<>(BY_CATEGORY);

    public boolean enquire(final Customer customer, final Category type){
        return enquiries.offer(new Enquiry(customer, type));
    }

    public void processAllEnquires(){

        Enquiry enquiry;

        while ((enquiry = enquiries.poll()) != null){
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
        }
    }

    public static void main(String[] args) {

        PriorityHelpDesk priorityHelpDesk = new PriorityHelpDesk();

        priorityHelpDesk.enquire(Customer.JACK, Category.PHONE);
        priorityHelpDesk.enquire(Customer.JILL, Category.PRINTER);
        priorityHelpDesk.enquire(Customer.MARY, Category.COMPUTER);

        priorityHelpDesk.processAllEnquires();
    }
}
