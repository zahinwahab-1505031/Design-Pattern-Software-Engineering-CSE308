/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficsignal_mediator;

/**
 *
 * @author Zahin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      LightMediator m = new LightMediator();
      Light red = new RedLight(m);
      Light green = new GreenLight(m);
      Light yellow = new YellowLight(m);
      m.addColleague(yellow);
      m.addColleague(red);
      m.addColleague(green);
      red.send(true);
      m.printCurrentStatus();
    }
    
}
