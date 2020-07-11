/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficsignal_mediator;

import java.util.ArrayList;

/**
 *
 * @author Zahin
 */
public class LightMediator {
    
  private ArrayList<Light> lights;
  public LightMediator() {
    lights = new ArrayList<Light>();
  }
  public void addColleague(Light colleague) {
    lights.add(colleague);
  }
  public void send(boolean status, Light originator) {
    for(Light light: lights) {
      if(light != originator) {
        light.receive(status);
      }
    }
  }
  
   public void printCurrentStatus() {
    for(Light light: lights) {
       light.getNameAndStatus();
    }
  }
  
}
