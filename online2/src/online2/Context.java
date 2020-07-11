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
public class Context {
   Search searchingAlgo;
   public void doSearch(int arr[],int x,int n,int num){
       if(num==1) searchingAlgo = new StartFromBeginning();
       else if(num==2) searchingAlgo = new StartFromEnding();
       else if(num==3) searchingAlgo = new BinarySearch();
       else if(num==4) searchingAlgo = new JumpSearch();
     //  System.out.println("index: "+searchingAlgo.arraySearch(arr, x, n));
     if(searchingAlgo.arraySearch(arr, x, n)!=-1) System.out.println("found");
     else System.out.println("not found");
    }
}
