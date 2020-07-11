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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DollarDispenser d1 = new Dollar50Dispenser();
       DollarDispenser d2 = new Dollar20Dispenser();
       DollarDispenser d3 = new Dollar10Dispenser();
       d1.setNext(d2);
       d2.setNext(d3);
       d1.process(180);
    }
    
}
