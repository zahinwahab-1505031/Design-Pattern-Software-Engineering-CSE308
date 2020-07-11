/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online3;

/**
 *
 * @author Zahin
 */
public class ChariotArcher implements Mobile {
        int range = 25;
    int hp = 100;
    int step = 20;
    int damage = 25;
    int currentPosition = 0;
     public String shoot(){
         if((100-currentPosition)<=range){
           return "Advanced arrow ";
        }
         return "nothing";
       
     }
    public String drive(){
        currentPosition+=step;
        return "Driving ";
    }
    
}
