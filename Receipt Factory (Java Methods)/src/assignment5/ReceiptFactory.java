package assignment5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//This one
public class ReceiptFactory {

    String header;
    String stateCode;
    private Date date;

    private PurchasedItems items;
    private BasicReceipt basicReceipt;

    private TaxComputation taxComp;
    private TaxComputation MDTax = new MDTaxComputation();
    private TaxComputation MATax = new MATaxComputation();
    private TaxComputation DETax = new DETaxComputation();
    private TaxComputation CATax = new CATaxComputation();

    private Coupon100get10Percent coup = new Coupon100get10Percent();

    public void setTaxComp(TaxComputation taxComp) {
        this.taxComp = taxComp;
    }
    private AddOn addOns[] = new AddOn[3];   // secondary header, rebate and coupon add-ons

    public ReceiptFactory(PurchasedItems items, String header, String stateCode, Date date, BasicReceipt basic) {
        this.header = header;
        determineTax(this.stateCode);
        this.items = items;
        this.date = date;
        this.basicReceipt = basic;

        addOns[0] = new HolidayGreeting();
        addOns[1] = new Rebate1406();
        addOns[2] = new Coupon100get10Percent();
    }

    /*
    public void determineAddOns(PurchasedItems items) {
        int counter = 0;
        int length = this.items.getItems().size();

        if
        
        
        for (int i = 0; i < length; i++) {
            if (items.getItems().get(i).getItemPrice() > 100) {
                this.addOns[counter] = coup;
                counter++;
                break;
            }
        }
    }

     */
    public void determineTax(String state) {
        if (state == "MD") {
            setTaxComp(MDTax);
        }
        if (state == "DE") {
            setTaxComp(DETax);
        }
        if (state == "CA") {
            setTaxComp(CATax);
        }
        if (state == "MA") {
            setTaxComp(MATax);
        }
    }

    public void getReceipt() {
        HolidayGreeting greet = new HolidayGreeting();
        Coupon100get10Percent coup = new Coupon100get10Percent();
        Rebate1406 rebate = new Rebate1406();
        
        System.out.println(header);
        
        Date holidayStartdate = new GregorianCalendar(2019, Calendar.DECEMBER, 01).getTime();

            if ((this.addOns[0].applies(this.items) == true) && (this.date.after(holidayStartdate))) {
                System.out.println(greet.getLines() + "\n");
            }

            this.basicReceipt.printReceipt();
            
            
            if ((this.addOns[1].applies(this.items) == true)) {
                System.out.println(rebate.getLines() + "\n");
            }
            if ((this.addOns[2].applies(this.items) == true)) {
                System.out.println(coup.getLines() + "\n");
            }
            
            
    }

}
