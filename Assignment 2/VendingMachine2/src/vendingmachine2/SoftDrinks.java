/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine2;

/**
 *
 * @author Zahin
 */
public class SoftDrinks {
    private String name;
    private float price;
    private int quantity;
    public SoftDrinks(String name,float price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;   
    }
     
     public String getName(){
         return name;
     }
     public float getPrice(){
         return price;
     }
     public int getQuantity(){
         return quantity;
     }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String toString(){
        return "SoftDrinks name: "+ name+ " Price: "+price;
    }
}
