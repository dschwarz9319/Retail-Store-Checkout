package assignment5;

// Java Utility Imports
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

// This class computes taxes for a Maryland purchase
// while also cross-referencing to check if the 
// purchase date falls on a tax holiday
public class MDTaxComputation extends TaxComputation {

    private double salesTax = .06;
    
    // Calls local method taxHoliday and returns 0 if Date falls on
    // a pre-defined tax holiday for 2019, else returns the total cost
    // * .06, which is the standard sales tax for Maryland
    @Override
    public double computeTax(PurchasedItems items, Date receiptDate) {

        if (taxHoliday(receiptDate) == true) {
            return 0.0;
        } else {
            return items.getTotalCost() * this.salesTax;
        }
    }

    // This class sets two dates: the beginning of tax weekend for Mayland and the
    // end of tax weekend for Maryland. The returns true or false depending if
    // the date passed in through the parameter falls within those two dates
    @Override
    public boolean taxHoliday(Date receiptDate) {
        
        Date taxHolidayStartdate = new GregorianCalendar(2019, Calendar.AUGUST, 16).getTime();
        Date taxHolidayEnddate = new GregorianCalendar(2019, Calendar.AUGUST, 18).getTime();

        if (receiptDate.after(taxHolidayStartdate) && receiptDate.before(taxHolidayEnddate)) {
            return true;
        } else {
            return false;
        }
    }

    // Getter for local variable salesTax
    public double getSalesTax() {
        return salesTax;
    }

    // Setter for local variable salesTax
    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }
    
    

}
