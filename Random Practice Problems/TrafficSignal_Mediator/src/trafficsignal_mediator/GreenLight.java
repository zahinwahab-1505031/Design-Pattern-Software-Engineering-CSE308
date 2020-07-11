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
public class GreenLight implements Light{
    private LightMediator mediator;
    boolean status;
    String name;
  public GreenLight(LightMediator m) {
    mediator = m;
    name = "GREEN LIGHT";
  }
  //send a message via the mediator
  @Override
  public void send(boolean status) {
      this.status = status;
    mediator.send(status, this);
  }
  //get access to the mediator
  public LightMediator getMediator() {return mediator;}
  @Override
  public void receive(boolean status){
      this.status = !status;
  }
  @Override
  public void getNameAndStatus(){
      System.out.println("Light: "+this.name+" Status: "+this.status);
  }
}
