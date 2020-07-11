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
public class AbstractFactoryOffline {

//    private static Application configureApplication() {
//        Application app;
//        ResolutionFactory factory;
//        String osName = "low";
//        if (osName.contains("low")) {
//            factory = new LowResolutionFactory();
//            app = new Application(factory);
//        } else {
//            factory = new HighResolutionFactory();
//            app = new Application(factory);
//        }
//        return app;
//    }

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
