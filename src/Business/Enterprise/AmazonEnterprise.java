/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Customer.CustomerDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ketki
 */
public class AmazonEnterprise extends Enterprise{

    
    public AmazonEnterprise(String name) {
        super(name, EnterpriseType.AMAZON);
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public CustomerDirectory getCustomerDirectory() {
        return super.getCustomerDirectory(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
