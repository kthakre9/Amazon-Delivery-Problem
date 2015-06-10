/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PackagingRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ketki
 */
public class PackagingManagementOrganization extends Organization{

    public PackagingManagementOrganization() {
    super(Organization.Type.PackagingManagement.getValue());;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PackagingRole());
        return roles;
    }
    
}
