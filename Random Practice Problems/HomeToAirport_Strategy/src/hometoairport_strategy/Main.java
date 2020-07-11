/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometoairport_strategy;

/**
 *
 * @author Zahin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Context context = new Context();
        Transport transport = context.returnTransport(Cost.low, Time.less);
        transport.getDescription();
         transport = context.returnTransport(Cost.high, Time.less);
        transport.getDescription();
          transport = context.returnTransport(Cost.low, Time.more);
        transport.getDescription();
    }
    
}
