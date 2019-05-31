package assignment5;

//This interface was pre-defined by the assignment:
    // The type of added info to a BasicReceipt 
    // (e.g., greetings, rebates, coupons)

public interface AddOn {
    
    public boolean applies(PurchasedItems items);
    public String getLines();
    
    
}
