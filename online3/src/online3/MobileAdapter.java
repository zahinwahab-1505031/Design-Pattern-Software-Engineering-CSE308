/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online3;


public class MobileAdapter implements Infantry {
    Mobile mobile;
    public MobileAdapter(Mobile mobile) {
        this.mobile = mobile;
    }
    
      public String shootArrow(){
       return mobile.shoot();
    }
    public String walk(){
      return  mobile.drive();
    }

    
}

/*public class InfantryAdapter implements Mobile {
    Infantry infantry;
    public InfantryAdapter(Infantry infantry) {
        this.infantry = infantry;
    }
    
     public void shoot(){
         
     }
    public void drive(){
        
    }

    
}*/
