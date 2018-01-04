package queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class CategorisedHelpDesk {
    private Queue<Enquiry> enquiries = new ArrayDeque<>();

    public boolean enquire(final Customer customer, final Category type) {
        return  enquiries.offer(new Enquiry(customer, type));
    }

    public void processPrinterEnquiry() {
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && enquiry.getCategory() == Category.PRINTER) {
            enquiries.remove();
            enquiry.getCustomer().reply("Is is out of paper?");
        } else {
            System.out.println("No work to do, let's have some coffee!");
        }
    }

    public void processGeneralEnquiry() {
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && enquiry.getCategory() != Category.PRINTER) {
            enquiries.remove();
            enquiry.getCustomer().reply("Have you tried to turn it off and on again?");
        } else {
            System.out.println("No work to do, let's have some coffee!");
        }
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
