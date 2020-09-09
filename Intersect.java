/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_7;

import static lab_7.FindIntersection.printIntersection;

/**
 *
 * @author priyadharshini
 */
public class Intersect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	
	        int arr1[] = { 1, 2, 4, 5, 6 }; 
		int arr2[] = { 2, 3, 5, 7 }; 
		int m = arr1.length; 
		int n = arr2.length; 
		printIntersection(arr1, arr2, m, n); 
	} 
} 

        // TODO code application logic here
    
    

// Java program to find intersection of 
// two sorted arrays 

class FindIntersection { 
	
	static void printIntersection(int arr1[], int arr2[], int m, int n) 
	{ 
		int i = 0, j = 0; 
		while (i < m && j < n) { 
			if (arr1[i] < arr2[j]) 
				i++; 
			else if (arr2[j] < arr1[i]) 
				j++; 
			else { 
				System.out.print(arr2[j++] + " "); 
				i++; 
			} 
                }
        }
}

	

