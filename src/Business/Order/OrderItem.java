/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Invoice.Invoice;
import Business.Product.Product;

/**
 *
 * @author Ketki
 */
public class OrderItem {
    
    private Product product;
    private int quantity;
    private Invoice invoice;
   // private String status;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

  /*  public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    */
    
    @Override
    public String toString()
    {
        return product.toString();
    }
    
}
