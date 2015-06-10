/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SalesPersonRole;
import java.util.ArrayList;

/**
 *
 * @author Ketki
 */
public class OrderManagementOrganization extends Organization{

    public OrderManagementOrganization() {
        super(Organization.Type.OrderManagement.getValue());;
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
    
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SalesPersonRole());
        return roles;
    }
    
}
