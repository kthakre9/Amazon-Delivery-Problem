/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ketki
 */
public class LocalRetailerEnterprise extends Enterprise{

    public LocalRetailerEnterprise(String name) {
        super(name, EnterpriseType.LOCALRETAILERS);
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
