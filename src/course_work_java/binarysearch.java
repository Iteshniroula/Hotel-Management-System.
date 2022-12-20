/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course_work_java;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author 97798
 */
public class binarysearch {
        public int binarySearch(ArrayList<Integer> listPrice, int low, int high, Integer key) {
            //Binary Search Algorithm
		if (low <= high) {
			int mid = (low + high) / 2; // get mid point
			if (listPrice.get(mid).equals(key)) {
				return mid;
                                
			} else if ((key.compareTo(listPrice.get(mid))) < 0) {
				return binarySearch(listPrice, low, mid - 1, key);
			} else {
				return binarySearch( listPrice,mid + 1, high, key);
			}
		}
		else {
                    //Returns if there is no value in the Array Lists
			return -1;
		}
	}  
    }
        
        
       
    
                 
    
    
    
   
    
    
    
    

    
    
