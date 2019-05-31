package assignment5;

//This class was (mostly) pre-defined by the assignment

public abstract class Decorator implements Receipt{
    
    private Receipt trailer;
    private AddOn addOn;

    // Prints Receipt of 'trailer' variable
    public void callTrailer() {
        trailer.printReceipt();
    }
    
    public abstract void printReceipt();
    
    // Getter for trailer
    public Receipt getTrailer() {
        return trailer;
    }

    // Setter for trailer
    public void setTrailer(Receipt trailer) {
        this.trailer = trailer;
    }

    // Getter for AddOn
    public AddOn getAddOn() {
        return addOn;
    }

    // Setter for AddOn
    public void setAddOn(AddOn addOn) {
        this.addOn = addOn;
    }

    // Constructor with @params:
    //    ( trailer , addOn )
    public Decorator(Receipt trailer, AddOn addOn) {
        this.trailer = trailer;
        this.addOn = addOn;
    }


}
