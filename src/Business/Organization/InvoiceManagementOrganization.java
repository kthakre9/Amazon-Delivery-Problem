/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InvoiceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ketki
 */
public class InvoiceManagementOrganization extends Organization{

    public InvoiceManagementOrganization() {
        super(Organization.Type.InvoiceManagement.getValue());;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {

        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InvoiceRole());
        return roles;
    }
    
}
