package queues.helpdesk;

import queues.Category;
import queues.Customer;
import queues.Enquiry;

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

    private Queue<Enquiry> enquiries = new PriorityQueue<>(BY_CATEGORY);

    public boolean enquire(final Customer customer, final Category type) {
        return  enquiries.offer(new Enquiry(customer, type));
    }

//    public void processEnquiry(final Predicate<Enquiry>predicate, final String message) {
//        final Enquiry enquiry = enquiries.peek();
//        if (enquiry != null && predicate.test(enquiry)) {
//            enquiries.remove();
//            enquiry.getCustomer().reply(message);
//        } else {
//            System.out.println("No work to do, let's have some coffee!");
//        }
//    }
//
//    public void processPrinterEnquiry() {
//        processEnquiry(
//                enq -> enq.getCategory() != Category.PRINTER,
//                "Is it out of paper?"
//        );
//    }
//
//    public void processGeneralEnquiry() {
//        processEnquiry(
//                enq -> enq.getCategory() != Category.PRINTER,
//                "Have you tried to turn it off and on again?"
//        );
//    }


    public void processAllEnquiries() {
        Enquiry enquiry;

        while ((enquiry = enquiries.poll()) != null) {
            enquiry.getCustomer().reply("Have you tried turn it on and off again?");
        }
    }

    public static void main(String[] args) {
        PriorityHelpDesk helpDesk = new PriorityHelpDesk();

        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);
        helpDesk.enquire(Customer.MARY, Category.COMPUTER);

        helpDesk.processAllEnquiries();
    }
}
