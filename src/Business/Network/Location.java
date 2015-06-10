/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Ketki
 */
public class Location {
    
    private String location;
    private EnterpriseDirectory enterpriseDirectory;

    public Location() {
        enterpriseDirectory = new EnterpriseDirectory();
    }
    

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    @Override
    public String toString() {
        return location;
    }
    
    
    
}
