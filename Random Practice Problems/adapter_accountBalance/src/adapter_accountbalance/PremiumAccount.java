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
public class PremiumAccount extends IndianAccount{
    int balance;

    public PremiumAccount(int balance) {
        this.balance = balance;
    }
    
    @Override
    public int getBalance(){
        return balance;
    }
}
