/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zahin
 */
public class VendingMachine {
    protected List<SoftDrinks> list = new ArrayList<SoftDrinks>();
   private State state;
   protected float totalMoney;
   protected Delivery delivery;
   public VendingMachine(){
       state = new DefaultState(this);
   }
   public State getState(){
       return state;
   }
   public void setState(State state){
       this.state = state;
   }
   public List getList(){
       return list;
   } 

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
    public void Print(){
        System.out.println("Vending Machine current status: total: "+totalMoney);
       for(SoftDrinks drinks: list) {
           System.out.println("Name: "+drinks.getName()+" Price: "+drinks.getPrice()+" Quantity: "+drinks.getQuantity());
    }
    }
    public void PrintMenu(){
        System.out.println("Vending Machine menu");
       for(SoftDrinks drinks: list) {
           System.out.println("Name: "+drinks.getName()+" Price: "+drinks.getPrice());
    }
    }
    public Delivery Request(Order order){
        return   state.handle(order);
    
    }
}
