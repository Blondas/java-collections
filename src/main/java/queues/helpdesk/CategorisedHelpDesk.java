package queues.helpdesk;

import queues.Category;
import queues.Customer;
import queues.Enquiry;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

public class CategorisedHelpDesk {
    private Queue<Enquiry> enquiries = new ArrayDeque<>();

    public boolean enquire(final Customer customer, final Category type) {
        return  enquiries.offer(new Enquiry(customer, type));
    }

    public void processEnquiry(final Predicate<Enquiry>predicate, final String message) {
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && predicate.test(enquiry)) {
            enquiries.remove();
            enquiry.getCustomer().reply(message);
        } else {
            System.out.println("No work to do, let's have some coffee!");
        }
    }

    public void processPrinterEnquiry() {
        processEnquiry(
                enq -> enq.getCategory() != Category.PRINTER,
                "Is it out of paper?"
        );
    }

    public void processGeneralEnquiry() {
        processEnquiry(
                enq -> enq.getCategory() != Category.PRINTER,
                "Have you tried to turn it off and on again?"
        );
    }


    public void processAllEnquiries() {
        Enquiry enquiry;

        while ((enquiry = enquiries.poll()) != null) {
            enquiry.getCustomer().reply("Have you tried turn it on and off again?");
        }
    }

    public static void main(String[] args) {
        CategorisedHelpDesk helpDesk = new CategorisedHelpDesk();
        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, Category.PRINTER);

        helpDesk.processPrinterEnquiry();
        helpDesk.processGeneralEnquiry();
        helpDesk.processPrinterEnquiry();
    }
}
