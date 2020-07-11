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
public class DefaultState implements State {
    VendingMachine vendingMachine;
    public DefaultState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    @Override
    public Delivery handle(Order order){
        return null;
    }
    @Override
    public void Next(Order order){
        for(SoftDrinks drinks: vendingMachine.list) {
               if(drinks.getName().equalsIgnoreCase(order.getName())){
                   if(drinks.getQuantity()>0){
                       if(order.getMoney() == drinks.getPrice()){
                           vendingMachine.setDelivery(new Delivery(drinks,0));
                           vendingMachine.setState(new ProductAndNoChange(vendingMachine));
                        }
                       else if (order.getMoney() >= drinks.getPrice()){
                           float change = order.getMoney() - drinks.getPrice();
                         //  if(change <=vendingMachine.totalMoney){
                               vendingMachine.setDelivery(new Delivery(drinks,change));
                                 vendingMachine.setState(new ProductAndChange(vendingMachine));
                       
                          // }
//                           else if(change > vendingMachine.totalMoney){
//                               vendingMachine.setDelivery(new Delivery(null,order.getMoney()));
//                               vendingMachine.setState(new NoProductLackOfChange(vendingMachine));
//                       
//                           }
                       }
                       else if(order.getMoney() < drinks.getPrice()){
                           vendingMachine.setDelivery(new Delivery(null,order.getMoney()));
                            vendingMachine.setState(new NoProductInsufficientCurrency(vendingMachine));
                       
                       }
                   }
                   else {
                       vendingMachine.setDelivery(new Delivery(null,order.getMoney()));
                       vendingMachine.setState(new NoProductInventoryDepletion(vendingMachine));
                       
                   }
               }
           }
                       
    }
//    @Override
//    public void doAction(VendingMachine vendingMachine){
//        vendingMachine.setState(this);
//    }
}
