/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Invoice.InvoiceDirectory;
import Business.Order.MasterOrderCatalog;
import Business.Order.Order;
import Business.Role.Role;
import Business.Supplier.SupplierDirectory;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    private SupplierDirectory supplierDirectory;
    private MasterOrderCatalog masterOrderCatalog;
    private CustomerDirectory customerDirectory;
    private InvoiceDirectory invoiceDirectory;
    private Order order;
    
    public enum Type{
        Admin("Admin Organization"),
        OrderManagement("Order Management Organization"),
        Customer("Customer Organization"),
        Supplier("Supplier Organization"),
        InventoryManagement("Inventory Management Organization"),
        InvoiceManagement("Invoice Management Organization"),
        PackagingManagement("Packaging Management Organization"),
        ShippingManagement("Shipping Management Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
        
        this.supplierDirectory = new SupplierDirectory();
        this.masterOrderCatalog = new MasterOrderCatalog();
        this.customerDirectory = new CustomerDirectory();
        this.invoiceDirectory = new InvoiceDirectory();
       
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public UserAccount authenticateUser(String username, String password){
        return this.userAccountDirectory.authenticateUser(username, password);
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public InvoiceDirectory getInvoiceDirectory() {
        return invoiceDirectory;
    }

    public Order getOrder() {
        return order;
    }

  

    
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
