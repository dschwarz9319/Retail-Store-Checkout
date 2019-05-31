package assignment5;

// Imports of Java Utilites
import java.util.Date;

public class BasicReceipt implements Receipt {

    private String storeInfo;  	// store number, store address, phone number
    private String stateCode;  	// MD, DE, CA or MA

    private PurchasedItems items;
    private Date date;
    
    private TaxComputation taxComp;
    private TaxComputation MDTax = new MDTaxComputation();
    private TaxComputation MATax = new MATaxComputation();
    private TaxComputation DETax = new DETaxComputation();
    private TaxComputation CATax = new CATaxComputation();

    // Passing in an ArrayList items as an arguement and assigns it to local
    // variable ArrayList items
    public BasicReceipt(PurchasedItems items) {
        this.items = items;
    }

    //Getter for storeInfo
    public String getStoreInfo() {
        return storeInfo;
    }

    // Setter for storeInfo
    public void setStoreInfo(String storeInfo) {
        this.storeInfo = storeInfo;
    }

    // Getter for stateCode
    public String getStateCode() {
        return stateCode;
    }

    // Setter for stateCode
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    // Setter for local taxComp variable
    public void setTaxComputation(TaxComputation tc) {
        this.taxComp = tc;
    }

    // Setter for local date variable
    public void setDate(Date date) {
        this.date = date;
    }

    // This function selects which tax/holiday policy to apply to a purchase
    // based off of the state code String that is passed through argument
    public void determineTax(String state) {
        if (state == "MD") {
            setTaxComputation(MDTax);
        }
        if (state == "DE") {
            setTaxComputation(DETax);
        }
        if (state == "CA") {
            setTaxComputation(CATax);
        }
        if (state == "MA") {
            setTaxComputation(MATax);
        }
    }

    // Prints out a receipt by concatonating a very large string with every
    // element of PurchasedItems object items
    public void printReceipt() {
        int length = this.items.getItems().size();
        String str = "";
        

        determineTax(this.stateCode);
        double tax = this.taxComp.computeTax( this.items, this.date );
        
        //System.out.println("Here is your Best Buy Receipt:");
        

        for (int i = 0; i < length; i++) {
            System.out.printf( this.items.getItems().get(i).getItemDescription() );
            System.out.println( "       " + this.items.getItems().get(i).getItemPrice() );
        }
        System.out.println("");
        System.out.println( "Total (without tax): " + this.items.getTotalCost() );
        System.out.println( "State sales tax: " + tax);
        System.out.println( "Total (including tax): " + (this.items.getTotalCost() + tax ));
        
        System.out.println("");
        System.out.println("Date of Purchase: " + this.date);
    }
}
