/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory_resolution_offline;

/**
 *
 * @author Zahin
 */
public class HighResDisplayDriver implements DisplayDriver {
    @Override
    public void display() {
        System.out.println("You have created high resolution display driver.");
    }
}
