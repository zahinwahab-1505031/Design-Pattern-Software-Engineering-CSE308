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
public class ProductAndChange implements State {
    VendingMachine vendingMachine;
    public ProductAndChange(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
     @Override
    public Delivery handle(Order order){
         vendingMachine.getDelivery().setDescription("Product is delivered with change");
        for(SoftDrinks drinks: vendingMachine.list) {
             if(drinks ==  vendingMachine.getDelivery().getSoftDrinks())
             {
                 vendingMachine.totalMoney+=order.getMoney();
                 vendingMachine.totalMoney-=vendingMachine.getDelivery().getChange();
                 int q = drinks.getQuantity();
                 q--;
                 drinks.setQuantity(q);
             }
           }
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

