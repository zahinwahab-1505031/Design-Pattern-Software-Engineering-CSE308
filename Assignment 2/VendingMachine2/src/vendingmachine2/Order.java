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
public class Order {
    private String name;
    private float money;
    public Order(String name,float money){
        this.name = name;
        this.money = money;
    }
    public String getName(){
        return name;
    }
    public float getMoney() {
        return money;
    }
}
