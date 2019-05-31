package assignment5;

// This class was (mostly) pre-defined in the assignment

public class StoreItem {
    
	private int itemCode;  		// e.g., 3010
	private String itemDescription;  	// e.g., Dell Laptop
	private double itemPrice;

    // Constructer for StoreItem with every local variable as a @param
    public StoreItem(int itemCode, String itemDescription, double itemPrice) {
        this.itemCode = itemCode;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }
        
    // Getter for itemCode
    public int getItemCode() {
        return itemCode;
    }

    // Setter for itemCode
    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    // Getter for itemDescription
    public String getItemDescription() {
        return itemDescription;
    }

    // Setter for itemDescription
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    // Getter for itemPrice
    public double getItemPrice() {
        return itemPrice;
    }

    // Setter for itemPrice
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

	
}

