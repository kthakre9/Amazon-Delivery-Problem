/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Invoice.Invoice;
import java.util.ArrayList;

/**
 *
 * @author Ketki
 */
public class Order {
    
    private ArrayList<OrderItem>orderItemList;
    private static int count = 0;
    private int id;
    private Invoice invoice;
    
    public Order()
    {
        this.orderItemList = new ArrayList<>();
        count++;
        id = count;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public OrderItem addOrderItem()
    {
        OrderItem oi = new OrderItem();
        orderItemList.add(oi);
        return oi;
    }
    
    public void removeOrderItem(OrderItem oi)
    {
        orderItemList.remove(oi);
    }
    
    public int totalPrice()
    {
        int total = 0;
        for(OrderItem oi : orderItemList)
        {
            total =  total+ oi.getQuantity()* oi.getProduct().getActualPrice();
        }
        return total;
    }
    
    public int getTotalPrice()
    {
        return totalPrice();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    
    
    
    @Override
    public String toString()
    {
        return String.valueOf(id);
    }
}
