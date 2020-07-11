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
public interface State {
    public Delivery handle(Order order);
    public void Next(Order order);
 //   public void doAction(VendingMachine vendingMachine);
}
