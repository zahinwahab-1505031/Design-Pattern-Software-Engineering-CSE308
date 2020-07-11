/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package online;

/**
 *
 * @author uesr
 */
public class RentVehicle {
    public  int number1;   //micro
      public  int number2; //car
    public RentVehicle(){
        number1 = 3;
        number2 = 3;
    }
    public vehicle getVehicle(int n,String s1,String s2){
        int a=0;
        int b=0;
        if(s1.equalsIgnoreCase("Y")){a = 1;}
         if(s2.equalsIgnoreCase("Y")){b = 1;}
     if(n>4 && number1>0)  { 
         number1--;
     return new Micro(a,b);
     }
     else if(n<=4 && number2>0) {
          number2=number2-1; 
        
     return new Car(a,b);
     }
     return null;
        
    }
    
}
