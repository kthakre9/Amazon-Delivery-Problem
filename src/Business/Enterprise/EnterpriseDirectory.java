/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.AMAZON){
            enterprise = new AmazonEnterprise(name);
        }
        else if (type == Enterprise.EnterpriseType.LOCALRETAILERS){
            enterprise = new LocalRetailerEnterprise(name);
        }
        
        enterpriseList.add(enterprise);
        return enterprise;
    }
    
    
}
