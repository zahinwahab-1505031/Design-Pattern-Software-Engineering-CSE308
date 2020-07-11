/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryoffline;

/**
 *
 * @author Zahin
 */
public class LowResDisplayDriver implements DisplayDriver {
    @Override
    public void display() {
        System.out.println("You have created low resolution display driver.");
    }
}
