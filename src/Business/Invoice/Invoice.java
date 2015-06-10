/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Invoice;

/**
 *
 * @author Ketki
 */
public class Invoice {
    private int invoiceID;
   private String status;
    private String cardNumber;
    private String amountPaid;
    private String expiryDate;
    private String securityCode;
    private static int count = 178100;
    private float tax=20;

    public Invoice() {
        
        count++;
        invoiceID = count;
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }
    
    
   public String getStatus() {
        return status;
        
    }

    public void setStatus(String status) {
        status = "pending";
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(String amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }
    
    
    
}
