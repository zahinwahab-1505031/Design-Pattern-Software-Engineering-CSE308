/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clothing_decorator;

/**
 *
 * @author Zahin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Garments shirt = new Shirt();
      //  System.out.println( shirt.getDescription());
        shirt = new Sweater(shirt);
            //  System.out.println( sweater.getDescription());
              shirt = new Raincoat(shirt);
               System.out.println( shirt.getDescription());
    }
    
}
