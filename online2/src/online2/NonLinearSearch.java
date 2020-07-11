/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online2;

import java.util.Arrays;

/**
 *
 * @author Zahin
 */
public abstract class NonLinearSearch implements Search {
   public abstract int arraySearch(int arr[],int x,int n);
   public void sort(int arr[],int x,int n){
        Arrays.sort(arr);
   }
}
