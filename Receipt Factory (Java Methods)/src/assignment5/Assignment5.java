package assignment5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author Dan Schwarz && Jessie Clemons
 */
public class Assignment5 {

    public static void main(String[] args) {

        int userChoice = 0;
        int stateChoice = 0;
        int productChoice = 0;
        int year = 2019;
        int month = 03;
        int day = 17;
        String state = "DE";
        Date today = new GregorianCalendar(year, Calendar.MARCH, day).getTime();
        
        Scanner input = new Scanner(System.in);
        //Scanner myObj = new Scanner(System.in); 
        
        String header = "Best Buy, Store # 100\n505 Electronics Lane\nTowson,MD 21005\n\n";
        
        StoreItem headphones = new StoreItem(1002, "Beats Headphones", 199.99);
        StoreItem laptop = new StoreItem(1001, "Dell Laptop", 34.99);
        StoreItem mouse = new StoreItem(1406, "Razor Mouse", 29.99);

        PurchasedItems myCart = new PurchasedItems();
        
while (userChoice != 4){
        System.out.println("1 - Start New Receipt");
        System.out.println("2 - Add Items");
        System.out.println("3 - Display Receipt");
        System.out.println("4 - Quit Program\n");
        System.out.println("Please enter the number of your choice: ");
    
        userChoice = input.nextInt();
 



if (userChoice == 1) {
    System.out.println("Please Enter 4 digit Year");
    year = input.nextInt();
    System.out.println("Please Enter 2 digit Month");
    month = input.nextInt();
    System.out.println("Please Enter 2 digit Day\n");
    day = input.nextInt();
    System.out.println("Please Enter number corresponding to your State");
     System.out.println("1 - California");
        System.out.println("2 - Deleware");
        System.out.println("3 - Maryland");
        System.out.println("4 - Massachusetts\n");
        System.out.println("Please enter the number of your choice: ");
   
        stateChoice = input.nextInt();
        
        if (stateChoice == 1) {
            state = "CA";
        }
        
        if (stateChoice == 2) {
            state = "DE";
        }
        
        if (stateChoice == 3) {
            state = "MD";
        }
        
        if (stateChoice == 4) {
            state = "MA";
        }
    
    if (month == 01) {
        today = new GregorianCalendar(year, Calendar.JANUARY, day).getTime();
    }
    if (month == 02) {
        today = new GregorianCalendar(year, Calendar.FEBRUARY, day).getTime();
    }
    if (month == 03) {
        today = new GregorianCalendar(year, Calendar.MARCH, day).getTime();
    }
    if (month == 04) {
        today = new GregorianCalendar(year, Calendar.APRIL, day).getTime();
    }
    if (month == 05) {
        today = new GregorianCalendar(year, Calendar.MAY, day).getTime();
    }
    if (month == 06) {
        today = new GregorianCalendar(year, Calendar.JUNE, day).getTime();
    }
    if (month == 07) {
        today = new GregorianCalendar(year, Calendar.JULY, day).getTime();
    }
    if (month == 8) {
        today = new GregorianCalendar(year, Calendar.AUGUST, day).getTime();
    }
    if (month == 9) {
        today = new GregorianCalendar(year, Calendar.SEPTEMBER, day).getTime();
    }
    if (month == 10) {
        today = new GregorianCalendar(year, Calendar.OCTOBER, day).getTime();
    }
    if (month == 11) {
        today = new GregorianCalendar(year, Calendar.NOVEMBER, day).getTime();
    }
    if (month == 12) {
        today = new GregorianCalendar(year, Calendar.DECEMBER, day).getTime();
    }
    
}

if (userChoice == 2) {
    
    myCart = new PurchasedItems();
    
    while (productChoice != 9999){
        System.out.println("1001 - Dell Laptop --- $34.99");
        System.out.println("1002 - Beats Headphones --- $199.99");
        System.out.println("1406 - Razor Mouse --- $24.99");
        System.out.println("9999 - Quit Ordering\n");
        System.out.println("Please enter the 4 digit product number of your choice.");
    
        productChoice = input.nextInt();
        
        if (productChoice == 1001) {
                    myCart.addItem(laptop);
        }
        
         if (productChoice == 1002) {
                    myCart.addItem(headphones);
        }
         
          if (productChoice == 1406) {
                    myCart.addItem(mouse);
        }
          
        
}
    productChoice = 0;
}

if (userChoice == 3) {
    System.out.println("\n\n\n-----------------------------------------------\n");


        BasicReceipt storeReceipt = new BasicReceipt(myCart);
        storeReceipt.setDate(today);
        storeReceipt.setStateCode(state);
        
        ReceiptFactory myFact = new ReceiptFactory(myCart, header, state, today, storeReceipt);
        myFact.getReceipt();
        
        
    System.out.println("-----------------------------------------------\n\n\n");
        
}

}



    }

}
