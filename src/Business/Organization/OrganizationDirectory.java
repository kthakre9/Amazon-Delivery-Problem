/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.OrderManagement.getValue())){
            organization = new OrderManagementOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomersOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.InventoryManagement.getValue())){
            organization = new InventoryManagementOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.InvoiceManagement.getValue())){
            organization = new InvoiceManagementOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.PackagingManagement.getValue())){
            organization = new PackagingManagementOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ShippingManagement.getValue())){
            organization = new ShippingManagementOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Supplier.getValue())){
            organization = new SupplierOrganiztion();
            organizationList.add(organization);
        }
        return organization;
    }
}