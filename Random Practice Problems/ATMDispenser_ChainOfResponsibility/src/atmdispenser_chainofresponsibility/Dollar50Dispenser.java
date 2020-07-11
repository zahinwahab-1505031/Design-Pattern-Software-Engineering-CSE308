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
public class Dollar50Dispenser implements DollarDispenser {
     private DollarDispenser nextInChain;
     @Override
    public void setNext(DollarDispenser c)
    {
        nextInChain = c;
    }
    @Override
    public void process(int money)
    {
       
       int remaining = money%50;
       int countOfNotes = money/50;
       System.out.println("Inside 50 dollar dispenser: "+countOfNotes+" fifty-dollar notes");
         if(nextInChain!=null)     nextInChain.process(remaining);
        
    }
}
