/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Product;

/**
 *
 * @author Rushabh
 */
public class Product {

    private int productId;
    private String name;
    private int price; 
    private int actualPrice;
    private int targetPrice;
    private int availability;
    
    public Product(){
       
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(int actualPrice) {
        this.actualPrice = actualPrice;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    
    
    @Override
    public String toString() {
        return name;
    }
    
    
    

}
