/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderrestaurantoffline;

import java.util.LinkedList;

/**
 *
 * @author Zahin
 */
public class Product {        // We can use any data structure that you prefer. We have used LinkedList here.   

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
