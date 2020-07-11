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
public class Dollar20Dispenser implements DollarDispenser {
     private DollarDispenser nextInChain;
     @Override
    public void setNext(DollarDispenser c)
    {
        nextInChain = c;
    }
    @Override
    public void process(int money)
    {
         
       int remaining = money%20;
       int countOfNotes = money/20;
       System.out.println("Inside 20 dollar dispenser: "+countOfNotes+" twenty-dollar notes");
         if(nextInChain!=null)     nextInChain.process(remaining);
    }
}
