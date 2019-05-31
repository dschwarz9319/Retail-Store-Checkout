package assignment5;

// Imports from Java Utilities
import java.util.Date;

// This class exists only to satisfy the abstract sales tax requirenment of 
// the parent abstract class. Because Delaware doesn't have any sales tax
public class DETaxComputation extends TaxComputation{
    
    // This function simply returns zero, as delaware doesn't have any sales tax
    @Override
    public double computeTax(PurchasedItems items, Date receiptDate) {
        return 0.0;
    }

    // This function returns false, because every day in Delaware is a sales
    // tax holiday
    @Override
    public boolean taxHoliday(Date receiptDate) {
        return false;
    }
}
