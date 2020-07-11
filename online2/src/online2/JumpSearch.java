/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online2;

import static java.lang.Double.min;
import static java.lang.Math.sqrt;
import java.util.Arrays;

/**
 *
 * @author Zahin
 */
public class JumpSearch extends NonLinearSearch{

    @Override
    public int arraySearch(int[] arr, int x, int n) {
             System.out.println("Inside Jump Seach: ");
       sort(arr,x,n);
          // Finding block size to be jumped
    int step = (int) Math.sqrt(n);
 
    // Finding the block where element is
    // present (if it is present)
    int prev = 0;
    while (arr[Math.min(step, n)-1] < x)
    {
        prev = step;
        step += sqrt(n);
        if (prev >= n)
            return -1;
    }
 
    // Doing a linear search for x in block
    // beginning with prev.
    while (arr[prev] < x)
    {
        prev++;
 
        // If we reached next block or end of
        // array, element is not present.
        if (prev == min(step, n))
            return -1;
    }
    // If element is found
    if (arr[prev] == x)
        return prev;
 
    return -1;
    }
    
}
