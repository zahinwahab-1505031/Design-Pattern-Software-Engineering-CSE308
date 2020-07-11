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
public class Context {
    Transport transport;
    public Transport returnTransport(Cost c,Time t){
        if(c==Cost.high && t==Time.less) transport = new Cab();
        else if(c==Cost.low && t==Time.less) transport = new Bus();
        else if(c==Cost.low && t==Time.more) transport = new Bicycle();
        return transport;
    }
}
