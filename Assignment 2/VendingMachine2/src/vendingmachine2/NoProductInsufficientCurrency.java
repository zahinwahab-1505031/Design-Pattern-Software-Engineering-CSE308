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
public class NoProductInsufficientCurrency implements State {
     VendingMachine vendingMachine;
    public NoProductInsufficientCurrency(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    @Override
    public Delivery handle(Order order){
        vendingMachine.getDelivery().setDescription("No product is delivered due to insufficient currency on deposit");
       
        return vendingMachine.getDelivery();
    }
    @Override
    public void Next(Order order){
         vendingMachine.setState(new DefaultState(vendingMachine));
    }
//    @Override
//    public void doAction(VendingMachine vendingMachine){
//        vendingMachine.setState(this);
//    }
}
