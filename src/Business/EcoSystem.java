/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Country;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;



/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem system;
    private ArrayList<Country> networkList;
    private OrganizationDirectory organizationDirectory;
    
    
    public static EcoSystem getInstance(){
        if (system == null){
            system = new EcoSystem();
        }
        return system;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Country> getCountryList() {
        return networkList;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }


    
    @Override
    public ArrayList<Role> getSupportedRole() {
        SystemAdminRole role = new SystemAdminRole();
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(role);
        return roleList;
    }

    public Country createAndAddCountry(String name){
        Country c = new Country();
        c.setCountry(name);
        networkList.add(c);
        return c;
    }
    
    
}