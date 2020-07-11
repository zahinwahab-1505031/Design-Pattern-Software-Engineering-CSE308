/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderrestaurantoffline2;

/**
 *
 * @author Zahin
 */
public abstract class Drink implements Item{
     @Override 
   public Packing packing() { 
      return new Cup(); 
   }
}
