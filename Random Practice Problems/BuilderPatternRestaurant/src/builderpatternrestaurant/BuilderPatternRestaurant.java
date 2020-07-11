/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpatternrestaurant;

import java.util.LinkedList;

// Builders common interface
interface IBuilder {

    void InsertMain();

    void InsertSide();

    void AddToys();

    void AddDrink();

    Product GetMeal();

}

// BagMeal is ConcreteBuilder
class BagMeal implements IBuilder {

    private Product product = new Product();

    @Override
    public void InsertMain() {

        product.Add("This is a body of a BagMeal");
    }

    @Override
    public void InsertSide() {
        product.Add("side item is added");
    }

    @Override
    public void AddToys() {
        product.Add("toys are added");
    }

    @Override
    public void AddDrink() {
        product.Add("Drink is added");
    }

    @Override
    public Product GetMeal() {
        return product;
    }

}

// "Product"
class Product {        // We can use any data structure that you prefer. We have used LinkedList here.   

    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<String>();
    }

    public void Add(String part) {
        //Adding parts   
        parts.addLast(part);
    }

    public void Show() {
        System.out.println("\n Product completed as below :");

        for (int i = 0; i < parts.size(); i++) {
            System.out.println(parts.get(i));
        }
    }
}
// "Director" 

class Director {

    IBuilder myBuilder;
    // A series of steps—for the production  

    public void Construct(IBuilder builder) {
        myBuilder = builder;
        myBuilder.InsertMain();
        myBuilder.InsertSide();
        myBuilder.AddToys();
        myBuilder.AddDrink();
    }

}

class BuilderPatternRestaurant {

    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***\n");

        Director director = new Director();

        IBuilder BagMealBuilder = new BagMeal();
        // Making BagMeal             
        director.Construct(BagMealBuilder);
        Product p1 = BagMealBuilder.GetMeal();
        p1.Show();

    }
}
