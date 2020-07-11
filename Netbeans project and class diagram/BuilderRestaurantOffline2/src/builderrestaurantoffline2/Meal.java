/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderrestaurantoffline2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Zahin
 */
public class Meal {
     private List<Item> items = new ArrayList<Item>(); 
 
 
   public void addItem(Item item){ 
      items.add(item); 
   } 
 
   
 
   public void showItems(){ 
       
 
      for (Item item : items) {
        System.out.print("Item : ");
        item.name(); 
        System.out.print(", Packing : ");
        item.packing().pack(); 
         
      }   
   }
      }

