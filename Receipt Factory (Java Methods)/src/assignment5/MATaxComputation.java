package assignment5;

// Java Utility Imports
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

// This class computes taxes for a Massachusetts purchase
// while also cross-referencing to check if the 
// purchase date falls on a tax holiday
public class MATaxComputation extends TaxComputation{
    
     private double salesTax = .0625;
    
    // Calls local method taxHoliday and returns 0 if Date falls on
    // a pre-defined tax holiday for 2019, else returns the total cost
    // * .0625, which is the standard sales tax for Massachusetts
    @Override
    public double computeTax(PurchasedItems items, Date receiptDate) {

        if (taxHoliday(receiptDate) == true) {
            return 0.0;
        } else {
            return items.getTotalCost() * this.salesTax;
        }
    }

    // This class sets two dates: August 10th and August 11th, which is the 
    // second weekend in August for 2019. If the receiptDate falls on either of
    // those two days taxHoliday returns True, otherwise it returns False
    @Override
    public boolean taxHoliday(Date receiptDate) {
        
        Date taxHolidayStartdate = new GregorianCalendar(2019, Calendar.AUGUST, 10).getTime();
        Date taxHolidayEnddate = new GregorianCalendar(2019, Calendar.AUGUST, 11).getTime();

        if (receiptDate.equals(taxHolidayStartdate) || receiptDate.equals(taxHolidayEnddate)) {
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
