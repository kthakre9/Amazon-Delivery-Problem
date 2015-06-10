/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Product;

import java.util.ArrayList;

/**
 *
 * @author Rushabh
 */
public class ProductCatalog {
    
    private ArrayList<Product> productList;

    public ProductCatalog() {
        productList = new ArrayList<>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public Product newProduct(){
        Product prod = new Product();
        productList.add(prod);
        return prod;
    }
    public void removeProduct(Product p){
        productList.remove(p);
    }
    
    public Product findByID(int id){
        
        for(Product p: productList){
            if(p.getProductId()== id){
                return p;
            }
        }
        return null;
    }
   
}
