/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package online;

import java.util.Scanner;

/**
 *
 * @author uesr
 */
public class Online {
static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    RentVehicle rent=new RentVehicle();
        while(true){
      String n =sc.nextLine();
      String s1 = sc.nextLine();
      String s2 = sc.nextLine();
      int a = Integer.parseInt(n);
  
      vehicle v = rent.getVehicle(a,s1,s2);
      if(v==null) {
          System.out.println("we have run out of vehicle");
      }
      else {  v.name();
     v.price();
      }
    
        }
      
    }
}
