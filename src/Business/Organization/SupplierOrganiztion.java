/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SupplierRole;
import java.util.ArrayList;

/**
 *
 * @author Ketki
 */
public class SupplierOrganiztion extends Organization{

    public SupplierOrganiztion() {
        super(Organization.Type.Supplier.getValue());;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
    
        
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SupplierRole());
        return roles;
    }
    
}
