package assignment5;

//Java Utility Imports
import java.util.Date;

//This class was pre-defined in the assignment

public abstract class TaxComputation {
    public abstract double computeTax(PurchasedItems items, Date receiptDate);
    public abstract boolean taxHoliday(Date receiptDate);
}
