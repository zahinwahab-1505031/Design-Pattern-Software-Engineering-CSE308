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
public class NoProductInventoryDepletion implements State {
    VendingMachine vendingMachine;
    public NoProductInventoryDepletion(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
     @Override
    public Delivery handle(Order order){
        vendingMachine.getDelivery().setDescription("No product is delivered due to inventory depletion");
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
