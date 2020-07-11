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
public class Delivery {
    private SoftDrinks softDrinks;
    private float change;
    private String description;
    public Delivery(SoftDrinks softDrinks, float change) {
        this.softDrinks = softDrinks;
        this.change = change;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public SoftDrinks getSoftDrinks() {
        return softDrinks;
    }

    public float getChange() {
        return change;
    }

    public void setSoftDrinks(SoftDrinks softDrinks) {
        this.softDrinks = softDrinks;
    }

    public void setChange(float change) {
        this.change = change;
    }
    
}
