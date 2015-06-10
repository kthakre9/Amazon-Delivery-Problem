/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Invoice;

import java.util.ArrayList;

/**
 *
 * @author Ketki
 */
public class InvoiceDirectory {
    private ArrayList<Invoice> invoicesList;


    public InvoiceDirectory() {
        this.invoicesList = new ArrayList<>();
    }

    public ArrayList<Invoice> getInvoicesList() {
        return invoicesList;
    }

    public void setInvoicesList(ArrayList<Invoice> invoicesList) {
        this.invoicesList = invoicesList;
    }

    public Invoice addInvoice()
    {
        Invoice i = new Invoice();
        invoicesList.add(i);
        return i;
    }
    public void removeinvoice(Invoice i)
    {
        invoicesList.remove(i);
    }
    
}
