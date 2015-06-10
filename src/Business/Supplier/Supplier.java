/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Supplier;

import Business.Network.Location;
import Business.Product.ProductCatalog;

/**
 *
 * @author Rushabh
 */
public class Supplier {
    private String name;
    private Location location;
    private ProductCatalog productCatalog;
    
    public Supplier(){
        productCatalog = new ProductCatalog();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    
    
    @Override
        public String toString() {
        return name;
    }
    
    
}
