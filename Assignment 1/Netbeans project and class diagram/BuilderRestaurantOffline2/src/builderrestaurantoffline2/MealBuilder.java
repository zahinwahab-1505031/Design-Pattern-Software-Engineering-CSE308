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
public class MealBuilder {
    public Meal meal;
    public MealBuilder(){
        meal = new Meal();
    }
    public void addMain(MainItem main){
        
        meal.addItem(new HamBurger());
    }
    public void addSide(SideItem side){
        
        meal.addItem(side);
    }
    public void addToy(Toy toy){
        
        meal.addItem(toy);
    }
    public void addDrink(Drink drink){
        
        meal.addItem(drink);
    }
    public Meal getMeal(){
        return meal;
    }
}
