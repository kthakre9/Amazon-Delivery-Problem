package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author Ketki
 */
public class MasterOrderCatalog {
    private ArrayList<Order> orderList;
    
    public MasterOrderCatalog()
    {
        this.orderList = new ArrayList<>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public void addOrder(Order o)
    {
        orderList.add(o);
    }
    
    public void removeOrder(Order o)
    {
        orderList.remove(o);
    }
}
