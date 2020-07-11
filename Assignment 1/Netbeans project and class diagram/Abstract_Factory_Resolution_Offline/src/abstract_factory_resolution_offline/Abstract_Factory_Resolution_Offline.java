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
public class Abstract_Factory_Resolution_Offline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //    Application app = configureApplication();
     Application app;
        ResolutionFactory factory;
            factory = new LowResolutionFactory();
            app = new Application(factory);
        app.display();
        app.print();
        factory = new HighResolutionFactory();
            app = new Application(factory);
            app.display();
        app.print();
    }
    
}
