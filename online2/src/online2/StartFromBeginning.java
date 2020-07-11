/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online2;

/**
 *
 * @author Zahin
 */
public class StartFromBeginning extends LinearSearch {

    @Override
    public int arraySearch(int[] arr, int x, int n) {
        System.out.println("Inside startFromBeginning: ");
     for(int i=0;i<n;i++)    if(arr[i]==x) return i;
    return -1;
    }
    
}
