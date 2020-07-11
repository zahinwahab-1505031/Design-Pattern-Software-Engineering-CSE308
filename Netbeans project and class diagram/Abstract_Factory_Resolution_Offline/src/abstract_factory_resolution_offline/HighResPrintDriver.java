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
public class HighResPrintDriver implements PrintDriver{
     @Override
    public void print() {
        System.out.println("You have created high resolution print driver.");
    }
}
