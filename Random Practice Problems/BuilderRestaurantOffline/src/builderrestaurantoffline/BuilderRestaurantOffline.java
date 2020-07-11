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
public class BuilderRestaurantOffline {

    /**
     * @param args the command line arguments
     */
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
