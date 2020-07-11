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
public interface Light {
    public void receive(boolean status);
    public void send(boolean status);
    public void getNameAndStatus();
}
