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
public class LowResPrintDriver implements PrintDriver{
    @Override
    public void print() {
        System.out.println("You have created low resolution print driver.");
    }
}
