/*
    Derick Cates
    CIS 402A 305J
    Assignment 3.2
    Purchase.java

    The purchase of this program is to create a class called Purchase which
    has an invoice number, sales amount, and sales tax amount. The class should
    also calculate the sales tax within the method for setSalesAmt.
 */
//create Purchase class
public class Purchase {
    //variables for invoice number, sales amount, sales tax amount
    private String invoiceNum;
    private double saleAmt;
    private double salesTax;
    //static field for tax percentage... made final
    private static final double TAX_PERCENT = .075;
    //getter for invoice number
    public String getInvoiceNum() {
        return this.invoiceNum;
    }
    //setter for invoice number
    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }
    //getter for sales amount
    public double getSaleAmt() {
        return saleAmt;
    }
    //setter for sales amount
    public void setSaleAmt(double saleAmt) {
        this.saleAmt = saleAmt;
        //calculate sales tax
        salesTax = this.saleAmt * TAX_PERCENT;
    }
    //getter for sales tax amount
    public double getSalesTax() {
        return salesTax;
    }
    //method to display the object and its values
    public void display() {
        System.out.println("\n ***PURCHASE ORDER***");
        System.out.println("Invoice Number: " + this.invoiceNum);
        System.out.println("Sales Amount  : " + String.format("$%.2f",
            this.saleAmt));
        System.out.println("Sales Tax Amt : " + String.format("$%.2f",
            this.salesTax));
    }
}
