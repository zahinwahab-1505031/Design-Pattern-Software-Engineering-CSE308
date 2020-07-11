/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online3;

import java.util.Scanner;

/**
 *
 * @author Zahin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       MobileTower tower = new MobileTower();
       MobileAdapter adapter = new MobileAdapter(tower);
       int round = 1;
       while(tower.hp>=0){
           int i = sc.nextInt();
           if(i==1){
               Bowman bowman = new Bowman();
               while(bowman.hp>=0){
                 String s = bowman.walk();
                   String s1 = bowman.shootArrow();
               
                   System.out.println("Round: "+round+" Bowman : hp "+
                   bowman.hp+" Current Position: "+bowman.currentPosition+ " " + s +" "+ s1 );
              if(s1!="nothing") {
                  tower.hp-=bowman.damage;
              }   
              if(bowman.currentPosition >= 50)   {  System.out.println(" Tower : hp"+ tower.hp + adapter.shootArrow());
               bowman.hp-=tower.damage;}
             else   {  System.out.println(" Tower : hp"+ tower.hp);
              }
                   round++;
               }
           }
           else if(i==2){
               AdvancedBowman bowman = new AdvancedBowman();
               while(bowman.hp>=0){
                 String s = bowman.walk();
                   String s1 = bowman.shootArrow();
               
                   System.out.println("Round: "+round+" Advanced Bowman : hp"+
                   bowman.hp+" Current Position: "+bowman.currentPosition+ " " + s +" "+ s1 );
              if(s1!="nothing") {
                  tower.hp-=bowman.damage;
              }   
              if(bowman.currentPosition >= 50)   {  System.out.println(" Tower : hp"+ tower.hp + adapter.shootArrow());
               bowman.hp-=tower.damage;}
             else   {  System.out.println(" Tower : hp"+ tower.hp);
              }
                   round++;
               }
           }
           else if(i==3){
                 ChariotArcher archer = new ChariotArcher();
                  MobileAdapter adapter2 = new MobileAdapter(archer);
               while(archer.hp>=0){
                 String s = adapter2.walk();
                   String s1 = adapter2.shootArrow();
               
                   System.out.println("Round: "+round+" ARCHER : hp "+
                   archer.hp+" Current Position: "+archer.currentPosition+ " " + s +" "+ s1 );
              if(s1!="nothing") {
                  tower.hp-=archer.damage;
              }   
              if(archer.currentPosition >= 50)   {  System.out.println(" Tower : hp "+ tower.hp + adapter.shootArrow());
               archer.hp-=tower.damage;}
             else   {  System.out.println(" Tower : hp "+ tower.hp);
              }
                   round++;
               } 
               
           }
       }
    }
    
}
