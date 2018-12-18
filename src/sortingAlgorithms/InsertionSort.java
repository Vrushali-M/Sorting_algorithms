package sortingAlgorithms;

public class InsertionSort {
	

		// A function that Sorts the array using insertion Sort
	  
	    public static int[] insertionSort(int InputArray_InsertionSort[]) {
	    	
	    	
	        int arr_length = InputArray_InsertionSort.length;
	        
	        // Assigns value of at j to the temporary variable key
	        for (int j = 1; j < arr_length; j++) {
	            int key = InputArray_InsertionSort[j];
	            int i = j-1;
	           
	         // Swaps elements until the element to the left is smaller than
	         // the element to the right
	            while ( (i > -1) && ( InputArray_InsertionSort [i] > key ) ) {
	            	InputArray_InsertionSort [i+1] = InputArray_InsertionSort [i];
	                i--;
	            }
	            InputArray_InsertionSort[i+1] = key;
	          }
	        
	        return InputArray_InsertionSort;
	    }
	}


