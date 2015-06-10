/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author raunak
 */
public class PaymentWorkRequest extends WorkRequest{
    
    private String AmountPaid;

    public String getAmountPaid() {
        return AmountPaid;
    }

    public void setAmountPaid(String AmountPaid) {
        this.AmountPaid = AmountPaid;
    }

    
    
}
