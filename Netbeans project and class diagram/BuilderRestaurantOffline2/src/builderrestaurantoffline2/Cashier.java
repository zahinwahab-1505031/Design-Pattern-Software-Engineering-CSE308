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
public class Cashier {
    Meal meal = new Meal();
    public Cashier(){}
    public Meal construct(MealBuilder builder,MainItem main,SideItem side,Toy toy,Drink drink){
       
    
//        meal.addItem(main);
//        meal.addItem(toy);
//        meal.addItem(side);
//        meal.addItem(drink);
        builder.addMain(main);
        builder.addSide(side);
        builder.addDrink(drink);
        builder.addToy(toy);
        meal = builder.getMeal();
        return meal;
    }
}
