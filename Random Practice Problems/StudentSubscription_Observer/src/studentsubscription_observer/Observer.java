/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsubscription_observer;

/**
 *
 * @author Zahin
 */
public interface Observer {
    public void subscribe();
    public void unsubscribe();
    public void updateMessage();
    public String getID();
}
