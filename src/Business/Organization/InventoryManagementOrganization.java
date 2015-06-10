/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.InventoryManagementRole;
import java.util.ArrayList;
/**
 *
 * @author Ketki
 */
public class InventoryManagementOrganization extends Organization{

    public InventoryManagementOrganization() {
        super(Organization.Type.InventoryManagement.getValue());;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InventoryManagementRole());
        return roles;
    }
}
