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
public class BuilderRestaurantOffline2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainItem main = new HamBurger();
        SideItem side = new  Fries();
        Toy toy = new Dinosaur();
        Drink drink = new Coke();
        MealBuilder builder = new MealBuilder();
        Meal meal = new Meal();
        Cashier cashier = new Cashier();
        
        meal = cashier.construct(builder,main,side,toy,drink);
        meal.showItems();
    }
    
}
