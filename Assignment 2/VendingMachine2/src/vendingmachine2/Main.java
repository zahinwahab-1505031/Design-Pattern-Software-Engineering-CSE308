/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Zahin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       VendingMachine vendingMachine = new VendingMachine();
      DefaultState state = new DefaultState(vendingMachine);
       vendingMachine.list.add(new SoftDrinks("COKE",25,6));
       vendingMachine.list.add(new SoftDrinks("PEPSI",20,5));
       vendingMachine.list.add(new SoftDrinks("SPRITE",30,4));
       vendingMachine.list.add(new SoftDrinks("FANTA",35,5));
       vendingMachine.list.add(new SoftDrinks("FRUITO",30,10));
       
       vendingMachine.totalMoney = 0;
       Scanner sc = new Scanner(System.in);
       while(true){
           vendingMachine.PrintMenu();
           System.out.println("Place your order: ");
           String name = sc.nextLine();
           System.out.println("Insert your cash: ");
           float money = Float.valueOf(sc.nextLine()).floatValue();
           Order order = new Order(name,money);
           state.Next(order);
         Delivery delivery = vendingMachine.Request(order);
          System.out.println(delivery.getDescription());
         if(delivery.getSoftDrinks()!=null) System.out.println(delivery.getSoftDrinks().toString());
          if(delivery.getChange()!=0)  System.out.println("Returned amount: "+ delivery.getChange());
          vendingMachine.Print();
       }
    }
    
}
