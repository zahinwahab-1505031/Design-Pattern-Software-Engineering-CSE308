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
public class Application {
     private DisplayDriver displayDriver;
    private PrintDriver printDriver;

    public Application(ResolutionFactory factory) {
        displayDriver = factory.getDisplayDriver();
        printDriver = factory.getPrintDriver();
    }

    public void print() {
        printDriver.print();
    }
    public void display() {
        displayDriver.display();
    }
}
