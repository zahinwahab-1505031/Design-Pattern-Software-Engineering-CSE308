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
public class MobileTower implements Mobile{
    int range = 50;
    int hp = 200;
    int step = 0;
    int damage = 20;
     int currentPosition = 0;
    public String shoot(){
          return "Improved arrow ";
       
       
     }
    public String drive(){
        currentPosition+=step;
        return "Driving ";
    }
}
