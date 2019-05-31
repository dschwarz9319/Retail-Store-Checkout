package assignment5;

// This class was pre-defined from the assignment Handout

public class Rebate1406 implements AddOn {
    
    // This function returns all items that have a product ID / itemCode of 1406
    @Override
    public boolean applies(PurchasedItems items) {
		return items.containsItem(1406);
    }

        // This is a print message that informs user of rebate applicability
        @Override
	public String getLines() {
		return "Mail-in Rebate for Item #1406\n" + "Name:\n" +  "Address:\n\n" +
			   "Mail to: Best Buy Rebates, P.O. Box 1400, Orlando, FL";
	}
    
}
