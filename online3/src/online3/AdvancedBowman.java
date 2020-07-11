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
public class AdvancedBowman implements Infantry {
    int range = 20;
    int hp = 80;
    int step = 10;
    int damage = 20;
    int currentPosition = 0;
     public String shootArrow(){
        if((100-currentPosition)<=range){
            return "Fire arrow";
        }
        return "nothing";
    }
   public String walk(){
        currentPosition+=step;
        return "Walking";
    }
}