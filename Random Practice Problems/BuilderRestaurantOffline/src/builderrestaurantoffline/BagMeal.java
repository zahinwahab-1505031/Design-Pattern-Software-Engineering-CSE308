/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderrestaurantoffline;

/**
 *
 * @author Zahin
 */
public class BagMeal implements IBuilder {

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
        product.Add("toy is added");
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
