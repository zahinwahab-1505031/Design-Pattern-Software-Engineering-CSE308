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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StandardAccount sa = new StandardAccount(2000);
         System.out.println( sa.getBalance());
        OffshoreAccount oa = new OffshoreAccount(2000);
        AccountAdapter aa = new AccountAdapter(oa);
        System.out.println( aa.getBalance());
    }
    
}
