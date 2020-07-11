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
public class Bowman implements Infantry {
    int range = 15;
    int hp = 60;
    int step = 5;
    int damage = 15;
    int currentPosition = 0;
    public String shootArrow(){
        if((100-currentPosition)<=range){
            return "Basic arrow";
        }
        return "nothing";
    }
   public String walk(){
        currentPosition+=step;
        return "Walking";
    }
    
}
