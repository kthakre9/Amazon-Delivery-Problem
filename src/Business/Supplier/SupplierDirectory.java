/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Supplier;

import java.util.ArrayList;

/**
 *
 * @author Rushabh
 */
public class SupplierDirectory {
    private ArrayList<Supplier> supplierList;
    
    public SupplierDirectory(){
        supplierList = new ArrayList<>();
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
    
    public Supplier newSupplier(String name){
        Supplier supplier = new Supplier();
        supplierList.add(supplier);
        supplier.setName(name);
        return supplier;
    }
    public void removeSupplier(Supplier s){
        supplierList.remove(s);
    }

}
