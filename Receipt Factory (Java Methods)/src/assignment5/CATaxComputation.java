package assignment5;

//Java Utility Imports
import java.util.Date;


// This class computes taxes for a California purchase,
// because California doesn't have tax holidays, it doesn't need to check
// for any
public class CATaxComputation extends TaxComputation{
    
    private double salesTax = .075;

    // This function simply multiplies the total cost of the purchase by
    // California's sales tax (7.5%) and returns the result
     @Override
    public double computeTax(PurchasedItems items, Date receiptDate) {
        return items.getTotalCost() * this.salesTax;
    }

    // This function simply satisfies the abstract requirenment for checking
    // if there is a tax Holiday by returning false because California doesn't
    // have any tax holidays
    @Override
    public boolean taxHoliday(Date receiptDate) {
        return false;
    }
    
    // Getter for private variable salesTax
    public double getSalesTax() {
        return salesTax;
    }

    // Setter for private variable salesTax
    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

}
