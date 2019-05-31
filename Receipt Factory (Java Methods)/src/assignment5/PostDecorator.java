package assignment5;

// This class was (mostly) pre-defined in the assignment handout

public class PostDecorator extends Decorator {
    
    // Uses super() to call parent function and inherit variable definitions
    public PostDecorator(Receipt receipt, AddOn addOn) {
        super(receipt, addOn);
    }

    // Prints a line at the bottom of receipt and prints the addOn and Lines
    @Override
    public void printReceipt() {
        callTrailer();
        System.out.println(getAddOn().getLines());

    }
}
