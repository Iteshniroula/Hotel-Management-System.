/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course_work_java;

import java.util.ArrayList;

/**
 *
 * @author 97798
 */
public class SelectionSort {
    public ArrayList<Integer> selectionSort(ArrayList<Integer> listPrice) {
       
        //Initializing variables  
        int ind1 = 0;
        int j=0;
        int ind2 = 0;      
        //loop for sorting
        for(int i=1;i<listPrice.size();i++){
            
            ind1 = listPrice.get(i-1);
            ind2 = i-1;
            //nested loop for sorting
            for(j=i;j<listPrice.size();j++){
                if(listPrice.get(j)<ind1){
                    ind1 = listPrice.get(j);
                    ind2 = j;
                }
            }
        
            //Swap the smallest element with the first element of unsorted subarray
            swap(listPrice,i-1, ind2);           
        }
        return listPrice;
    }
    //sorting method using temporary value
    public void swap(ArrayList<Integer> listPrice,int sIndex,int dIndex){        
        int temp = listPrice.get(dIndex);
        listPrice.set(dIndex, listPrice.get(sIndex));
        listPrice.set(sIndex, temp);
    }
    
}
