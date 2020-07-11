/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmdispenser_chainofresponsibility;

/**
 *
 * @author Zahin
 */
public interface DollarDispenser {
    public void setNext(DollarDispenser nextInChain);
    public void process(int money);
}
