package com.krisdrum.collections.queues.helpdesk;

import com.krisdrum.collections.queues.Category;
import com.krisdrum.collections.queues.Customer;
import com.krisdrum.collections.queues.Enquiry;

import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk {
    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

    public void enquire(final Customer customer, final Category category) {
        enquiries.offer(new Enquiry(customer, category));
    }

    public void processAllEnquiries() {
        Enquiry enquiry;

        while((enquiry = enquiries.poll()) != null) {
            enquiry.getCustomer().reply("have you tried turning it off and on again?");
        }
    }

    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();
        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);

        helpDesk.processAllEnquiries();
    }
}
