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
public class BinarySearch extends NonLinearSearch{

    @Override
    public int arraySearch(int[] arr, int x, int n) {
        System.out.println("Inside Binary Search:");
       sort(arr,x,n);
        return      Arrays.binarySearch(arr, x);
    }
    
}
