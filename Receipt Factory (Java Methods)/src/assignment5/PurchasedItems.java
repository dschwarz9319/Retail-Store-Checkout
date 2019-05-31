package assignment5;

// Imports for Java Utilities
import java.util.ArrayList;

// This class focuses on various aspects of purchased items and their functions,
// including adding an item, checking if an item was purchased, and getting the
// total cost of all of the items
public class PurchasedItems {

    private ArrayList<StoreItem> items;

    // This function initializes the private Arraylist items
    public PurchasedItems() {
        items = new ArrayList();
    }

    // Getter for local ArrayList Variable items
    public ArrayList<StoreItem> getItems() {
        return items;
    }

    // Setter for local ArrayList Variable items
    public void setItems(ArrayList<StoreItem> items) {
        this.items = items;
    }

    
    
    // This function adds a StoreItem to the local ArrayList items
    public void addItem(StoreItem item) {
        items.add(item);
    }

    // This function adds up all of the prices for each element in the local
    // ArrayList items and returns the sum of every price totaled togethers
    public double getTotalCost() {
        double total = 0;
        int length = items.size();

        for (int i = 0; i < length; i++) {
            total = total + this.items.get(i).getItemPrice();
        }
        return total;
    }

    // This function parses the local ArrayList items and returns true if
    // the itemCode passed in as an argument matches any itemCode in the list
    public boolean containsItem(int itemCode) {

        int length = items.size();

        for (int i = 0; i < length; i++) {
            if (items.get(i).getItemCode() == itemCode) {
                return true;
            }
        }
        return false;
    }

}
