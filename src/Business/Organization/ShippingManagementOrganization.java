/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.ShippingRole;
import java.util.ArrayList;

/**
 *
 * @author Ketki
 */
public class ShippingManagementOrganization extends Organization{

    public ShippingManagementOrganization() {
        super(Organization.Type.ShippingManagement.getValue());;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ShippingRole());
        return roles;}
    
}
