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
public class AccountAdapter implements Account {
    OffshoreAccount offshoreAccount;

    public AccountAdapter(OffshoreAccount offshoreAccount) {
        this.offshoreAccount = offshoreAccount;
    }

    
    
    @Override
    public int getBalance(){
    return offshoreAccount.getOffShoreBalance();
    }
}
