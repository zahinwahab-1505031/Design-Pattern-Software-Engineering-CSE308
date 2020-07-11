/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online2;

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
      Context context = new Context();
       int []arr = {1,4,2,8,9,0,3,1,7,4};
       int n = 10;
       int x = 34;
       int whichAlgo = sc.nextInt();
       context.doSearch(arr, x, n, whichAlgo);
       
    }
    
}
