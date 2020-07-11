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
public class Director {

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
