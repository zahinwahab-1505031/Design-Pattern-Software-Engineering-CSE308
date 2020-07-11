/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package online;

/**
 *
 * @author uesr
 */
public class Car implements vehicle {
    public int p;
    public String n;
    public int c;
    public int ac;
    public int ct;
    public Car(int a,int b){
          p = 500;
           n = "car";    
           c = 4; 
           ac = a;  
           ct = b;
    }
   @Override
      public  void price(){

    if(ac==0&&ct==0)   {       System.out.println("NOTHING ADDED ");System.out.println(p+" ");}
    if(ac==0&&ct==1)   {p = 700;
           System.out.println("TOOLS ADDED ");
           System.out.println(p+" ");}
    if(ac==1&&ct==0)  { p = 800;       System.out.println("AC ADDED ");
    System.out.println(p+" ");}
    if(ac==1&&ct==1)  { p = 1000;       System.out.println("AC AND TOOLS BOTH ADDED ");
    System.out.println(p+" ");}
       
    
       
    }
 @Override
  public  void name(){
     System.out.println(n+" ");
     }
     @Override
 public  void capacity(){
    System.out.println(c+" ");
      }
     
}
