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
public class Cab implements Transport {
    @Override
    public void getDescription(){
        System.out.println("HIRED A CAB");
    }
}