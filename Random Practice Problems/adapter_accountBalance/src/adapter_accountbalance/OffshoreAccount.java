/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter_accountbalance;

/**
 *
 * @author Zahin
 */
public class OffshoreAccount  {
   
    
    int balance;
    public OffshoreAccount(int balance) {
        this.balance = balance;
    }
    
    public int getOffShoreBalance(){
      return balance-(3*balance)/100;  
    }
}
