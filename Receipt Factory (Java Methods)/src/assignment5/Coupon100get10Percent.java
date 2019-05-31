package assignment5;

// This class basically parses list for items that cost > 100 and applies a 
// message that says they get a 10% off coupon

public class Coupon100get10Percent implements Coupon {
    
    // This function parses the Arraylist items and searches for items whose 
    // total cost are greater than 100
      @Override
    public boolean applies(PurchasedItems items) {
        return items.getTotalCost() >= 100;
    }

    // This function prints a 10% off notification
    @Override
    public String getLines() {
        StringBuilder sb = new StringBuilder("");
        sb.append("BEST BUY COUPON: 10% off next purchase\n");
        sb.append("Good until 12/31/2019");
        return sb.toString();
    }
    
}
