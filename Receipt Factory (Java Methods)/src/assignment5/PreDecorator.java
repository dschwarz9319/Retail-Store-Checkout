package assignment5;

// This class was pre-defined in the assignment handout

public class PreDecorator extends Decorator{
    
       // Uses super() to call parent function and inherit variable definitions
    public PreDecorator(Receipt receipt, AddOn addOn) {
        super(receipt, addOn);
    }

    // Prints Add ons and Lines
    @Override
    public void printReceipt() {
        System.out.println(getAddOn().getLines());
        callTrailer();
    }
    
}
