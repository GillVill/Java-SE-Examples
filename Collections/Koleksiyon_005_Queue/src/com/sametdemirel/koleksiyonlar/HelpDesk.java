package com.sametdemirel.koleksiyonlar;

import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk {
    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(Customer customer, Category category){
        enquiries.offer(new Enquiry(customer, category)); //Offer metodu kuyruğa eleman ekler add'den farkı eklenecek
                                                         // eleman kuyrukta olduğunda olduğunda hata fırlatmaz false döndürür
    }

    public void processAllEnquiries(){
        Enquiry enquiry;

        while((enquiry = enquiries.poll()) != null){ //poll metodu kuyruktan eleman çıkarmaya yarar remove'dan farkı kuyruk boş olduğunda hata fırlatmak yerine null döndürmesi
            enquiry.getCustomer().reply("Have you tried turning off it and on again?");
        }
        /*while(!enquiries.isEmpty()){ //Kuyruk boş olmadığı süre döngü çalışır ve remove metoduyla kuyruktan elemanları çıkarır
            final Enquiry enquiry = enquiries.remove();
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
        }*/
    }
}
