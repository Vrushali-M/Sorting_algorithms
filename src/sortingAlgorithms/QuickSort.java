package sortingAlgorithms;

public class QuickSort {

	    public static int[] sort(int[] inputArr) {
	    	int array[];
		    int length;
	         
	        array = inputArr;
	        length = inputArr.length;
	        quickSort(array, 0, length - 1);
	        
	        return array;
	    }
	 
	    private static void quickSort(int[] array, int lowerIndex, int higherIndex) {
	         
	        int i = lowerIndex;
	        int j = higherIndex;
	        // calculate pivot number, I am taking pivot as middle index number
	        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
	        // Divide into two arrays
	        while (i <= j) {
	           
	            while (array[i] < pivot) {
	                i++;
	            }
	            while (array[j] > pivot) {
	                j--;
	            }
	            if (i <= j) {
	                exchangeNumbers(array, i, j);
	                //move index to next position on both sides
	                i++;
	                j--;
	            }
	        }
	        // call quickSort() method recursively
	        if (lowerIndex < j)
	            quickSort(array, lowerIndex, j);
	        if (i < higherIndex)
	            quickSort(array, i, higherIndex);
	    }
	 
	    private static void exchangeNumbers(int[] array, int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	     
	   
	}

