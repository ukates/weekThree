/*
    This is a class called PurchaseTest that is used to test out the Purchase
    class.  It creates an instance of the purchase class and then takes user
    input to get values for invoice number and sales amount. Finally it calls
    the display method from the Purchase class.
 */
//import scanner
import java.util.Scanner;
//create class PurchaseTest
public class PurchaseTest {
    //main method
    public static void main(String[] args) {
        //create instance of scanner class
        Scanner input = new Scanner(System.in);
        //create instance of purchase class
        Purchase purchaseOne = new Purchase();
        //prompt user for invoice number
        System.out.println("\nPlease enter an invoice number: ");
        //call setter for invoice in purchase class and pass input as parameter
        purchaseOne.setInvoiceNum(input.nextLine());
        //call setter for sales amount in purchase class
        System.out.println("Please enter the amount of sale: ");
        purchaseOne.setSaleAmt(input.nextDouble());
        //call method to display values for the object created purchaseOne
        purchaseOne.display();
    }
}
